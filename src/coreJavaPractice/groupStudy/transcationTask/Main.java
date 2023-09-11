package coreJavaPractice.groupStudy.transcationTask;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //1. Find all transactions in the year 2011 and sort them by value(small to high)

        List<Transaction> result1 = new ArrayList<>();
        result1 = transactions.stream()
                .filter(p -> p.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getYear))
                .collect(Collectors.toList());

        System.out.println(result1);

        //2. What are all the unique cities where the traders work?
        List<String> result2 = new ArrayList<>();
        result2 = transactions.stream()
                .map(p -> p.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result2);

        //3. Find all traders from Cambridge and sort them by name.
        List<Transaction> result3 = new ArrayList<>();
        result3 = transactions.stream()
                .filter(p -> p.getTrader().getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(p -> p.getTrader().getName()))
                .collect(Collectors.toList());

        System.out.println(result3);

        //4. Return a string of all traders’ names sorted alphabetically.
        List<String> result4 = new ArrayList<>();
        result4 = transactions.stream()
                .map(p -> p.getTrader().getName())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result4);

        //5. Are any traders based in Milan?

        boolean result5 = transactions.stream()
                .anyMatch(p -> p.getTrader().getCity().equals("Milan"));

        System.out.println(result5);
        System.out.println("--------------");
        //6. Print the values of all transactions from the traders living in Cambridge

        transactions.stream()
                .filter(p -> p.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //7. What is the highest value of all the transactions?

        Optional<Transaction> abc = transactions.stream()
                .max(Comparator.comparing(Transaction::getValue));

        //8. Find the transaction with the smallest value

        int result6 = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue)).get().getValue();

        System.out.println(result6);

       transactions.stream()
                .map( p-> p.getValue()+" "+p.getYear())
               .forEach(System.out::println);





    }
}
