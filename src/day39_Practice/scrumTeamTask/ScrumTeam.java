package day39_Practice.scrumTeamTask;

import java.util.ArrayList;

public class ScrumTeam {

    private ProductOwner PO;
    private BusinessAnalyst BO;
    private ScrumMaster SM;
    private ArrayList<Developer> developersList = new ArrayList<>();
    private ArrayList<Tester> testersList = new ArrayList<>();

    public ProductOwner getPO() {
        return PO;
    }

    public void setPO(ProductOwner PO) {
        this.PO = PO;
    }

    public BusinessAnalyst getBO() {
        return BO;
    }

    public void setBO(BusinessAnalyst BO) {
        this.BO = BO;
    }

    public ScrumMaster getSM() {
        return SM;
    }

    public void setSM(ScrumMaster SM) {
        this.SM = SM;
    }

    public ArrayList<Developer> getDevelopersList() {
        return developersList;
    }

    public void setDevelopersList(ArrayList<Developer> developersList) {
        this.developersList = developersList;
    }

    public ArrayList<Tester> getTestersList() {
        return testersList;
    }

    public void setTestersList(ArrayList<Tester> testersList) {
        this.testersList = testersList;
    }

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        setPO(PO);
        setBO(BA);
        setSM(SM);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.getName() +
                ", BO=" + BO.getName() +
                ", SM=" + SM.getName() +
                ", number of developers=" + developersList.size() +
                ",  number of testers=" + testersList.size() +
                '}';
    }
}
