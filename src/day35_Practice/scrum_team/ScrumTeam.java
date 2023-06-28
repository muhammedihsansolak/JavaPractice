package day35_Practice.scrum_team;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private String PO, BA, SM;
    private ArrayList<Tester> testerList = new ArrayList<>();
    private ArrayList<Developer> developerList = new ArrayList<>();
    private int daysOfSprint;

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public ArrayList<Tester> getTesterList() {
        return testerList;
    }

    public void setTesterList(ArrayList<Tester> testerList) {
        this.testerList = testerList;
    }

    public ArrayList<Developer> getDeveloperList() {
        return developerList;
    }

    public void setDeveloperList(ArrayList<Developer> developerList) {
        this.developerList = developerList;
    }

    public int getDaysOfSprint() {
        return daysOfSprint;
    }

    public void setDaysOfSprint(int daysOfSprint) {
        this.daysOfSprint = daysOfSprint;
    }

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
        setDaysOfSprint(daysOfSprint);
    }

    public void addTester(Tester tester){
        testerList.add(tester);
    }
    public void addTesters(Tester[] testers){
        testerList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        developerList.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        developerList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID ){
        testerList.removeIf(p -> p.getEmployeeID() == employeeID);
    }
    public void removeDeveloper(int employeeID){
        developerList.removeIf(p -> p.getEmployeeID() == employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testerList.size() +
                ", total number of developers=" + developerList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
/*
Attributes:
	                String PO, BA, SM;
	                ArrayList<Tester> testersList = new ArrayList<>();
	                ArrayList<Developer> devopsList = new ArrayList<>();
	                int daysOfSprint;

	               Add A constructor that can set the fileds PO, BA, and SM

	             Actions:
	                  addTester(Tester tester): adds the given tester to the testers ArrayList

	                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList

	                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList

	                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

	                  removeTester(long employeeID): removes the given tester from the testers ArrayList

	                  removeDeveloper(long employeeID): removes the developer from the developers ArrayList

	                  toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */
