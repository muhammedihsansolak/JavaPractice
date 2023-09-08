package coreJavaPractice.scrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private PO productOwner;
    private BA businessAnalyst;
    private SM scrumMaster;
    private ArrayList<Tester> testers = new ArrayList<>();
    private ArrayList<Developer> developers = new ArrayList<>();

    public PO getProductOwner() {
        return productOwner;
    }

    public void setProductOwner(PO productOwner) {
        this.productOwner = productOwner;
    }

    public BA getBusinessAnalyst() {
        return businessAnalyst;
    }

    public void setBusinessAnalyst(BA businessAnalyst) {
        this.businessAnalyst = businessAnalyst;
    }

    public SM getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(SM scrumMaster) {
        this.scrumMaster = scrumMaster;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public void setTesters(ArrayList<Tester> testers) {
        this.testers = testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(ArrayList<Developer> developers) {
        this.developers = developers;
    }

    void addTester(Tester tester) {
        testers.add(tester);
    }

    void addTesters(Tester[] tester) {
        testers.addAll(Arrays.asList(tester));
    }

    void removeTester(int ID) {
        testers.removeIf(p -> p.getID() == ID);
    }

    public ScrumTeam(PO productOwner, BA businessAnalyst, SM scrumMaster, ArrayList<Tester> testers, ArrayList<Developer> developers) {
        setProductOwner(productOwner);
        setBusinessAnalyst(businessAnalyst);
        setScrumMaster(scrumMaster);
        setTesters(testers);
        setDevelopers(developers);
    }

    void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    void addDevelopers(Developer[] developer) {
        developers.addAll(Arrays.asList(developer));
    }

    void removeDeveloper(int ID) {
        developers.removeIf(p -> p.getID() == ID);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner=" + productOwner.getName() +
                ", businessAnalyst=" + businessAnalyst.getName() +
                ", scrumMaster=" + scrumMaster.getName() +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}
