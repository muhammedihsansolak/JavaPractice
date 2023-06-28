package scrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonINC {

    public static void main(String[] args) {

        PO productOwner = new PO("Ömer", 22, 'M', 12222, 120000);

        SM sm = new SM("Muhammed", 24, 'M', 13333, 120000);

        BA ba = new BA("Meryem", 27, 'F', 14444, 12000);
        Tester tester1 = new Tester("Şenel", 49, 'M', 15555, 125000);
        Tester tester2 = new Tester("Mehmet", 18, 'M', 16666, 130000);
        Developer developer1 = new Developer("Tuğba", 32, 'F', 17777, -50);
        Developer developer2 = new Developer("Icell", 32, 'F', 18888, 140000);

        ArrayList<Tester> testers = new ArrayList<>(Arrays.asList(tester1,tester2));
        ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(developer1,developer2));

        ScrumTeam myTeam = new ScrumTeam(productOwner,ba,sm, testers,developers);
        System.out.println(myTeam);

        System.out.println(tester1);
        System.out.println(developer1);

        tester1.eat("Döner");
        developer1.drink("Su");
        tester1.work();

    }
}
