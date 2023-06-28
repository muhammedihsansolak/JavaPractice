package day10_Practice;

public class BakingContest {

    public static void main(String[] args) {

        double score1= 7,
                score2 = 7,
                score3 = 7;
        double totalScore = (score1 + score2 + score3)/3;

        double other1 = 8.1,
                other2 = 8.8;

        if (totalScore>other1 && totalScore>other2){
            System.out.println("Congratulations you earned \"First Place\" with a score of: " + totalScore);
        } else if ((totalScore>other1 && totalScore<other2)||(totalScore<other1 && totalScore>other2)) {
            System.out.println("Congratulations you earned \"Second Place\" with a score of: " + totalScore);
        } else if (totalScore<other1 && totalScore<other2){
            System.out.println("Congratulations you earned \"Third Place\" with a score of: " + totalScore);
        }


    }
}
/*
Task 8: BakingContest [multibranch, logical, arithmetic, relational]

You are in a baking contest and our cookies will be rated by 3 judges.

    Create a program that will define 3 scores for your cookies. Calculate the average score you earned.
    Then also define two other people's final score and determine which place you earned int the baking contest

        you can earn either: First place, Second place, or Third place

        Ex:
            input:
                your score = 8.5, 7.9, 8.3
                other people score = 8.5 and 7.9

                output: Congratulations you earned Second place with a score of: 8.2
                    -> don't worry about decimal formatting

 */