package coreJavaPractice.day36_Practice.scrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    String PO, BA, SM;
    ArrayList<Tester> testerList;
    ArrayList<Developer> developerList;

    public void setInfo(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester newTester){
        testerList.add(newTester);
    }
    public void addTesters(Tester[] newTesters){
        testerList.addAll(Arrays.asList(newTesters));
    }

    public void removeTester(int ID){
        testerList.removeIf(p -> p.ID == ID);
    }
    public void addDeveloper(Developer newDeveloper){
        developerList.add(newDeveloper);
    }
    public void addDevelopers(Developer[] newDevelopers){
        developerList.addAll(Arrays.asList(newDevelopers));
    }
    public void removeDeveloper(int ID ){
        developerList.removeIf(p -> p.ID == ID);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", number of testers='" + testerList.size() + '\'' +
                ", number of developers='" + developerList.size() + '\'' +
                '}';
    }
}
