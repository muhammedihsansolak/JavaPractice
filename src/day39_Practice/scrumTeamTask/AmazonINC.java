package day39_Practice.scrumTeamTask;

import java.util.Arrays;

public class AmazonINC {

    public static void main(String[] args) {

        Tester t1 = new Tester("ahmet",45,'M',345,"SDET",120000);
        Tester t2 = new Tester("mehemt",46,'M',543,"SDET",120000);

        Developer d1 = new Developer("Maxwell", 24,'M',456,"Developer",150000);
        Developer d2 = new Developer("Muhammed", 24,'M',658,"Developer",135000);

        ProductOwner PO = new ProductOwner("Hülya",25,'F',346,"PO",150000);
        ScrumMaster SM = new ScrumMaster("Melike",44,'F',245,"SM",140000);
        BusinessAnalyst BA = new BusinessAnalyst("Alex",36,'M',435,"BA",1360000);

        ScrumTeam team = new ScrumTeam(PO,BA,SM);
        team.getTestersList().add(t1);
        team.getDevelopersList().addAll(Arrays.asList(d1,d2));

        System.out.println(team);

    }
}
