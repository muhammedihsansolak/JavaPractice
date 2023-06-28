package day39_Practice.states;

public class States {
    //*** instance variables ***
    private String name, abbreviation, politicalParty, Governor, Senator;
    private double population, stateTax;

    public String getName() {
        return name;
    }

    //*** getters ***
    public String getAbbreviation() {
        return abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public String getSenator() {
        return Senator;
    }

    public double getPopulation() {
        return population;
    }

    public double getStateTax() {
        return stateTax;
    }

    //*** setters ***

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name");
            return;
        }
        this.name = name;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.isEmpty() || abbreviation.isBlank()) {
            System.err.println("Invalid abbreviation");
            return;
        }
        this.abbreviation = abbreviation;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.isEmpty() || politicalParty.isBlank()) {
            System.err.println("Invalid political party");
            return;
        }
        this.politicalParty = politicalParty;
    }

    public void setGovernor(String governor) {
        if (governor == null || governor.isEmpty() || governor.isBlank()) {
            System.err.println("Invalid governor");
            return;
        }
        Governor = governor;
    }

    public void setSenator(String senator) {
        if (senator == null || senator.isEmpty() || senator.isBlank()) {
            System.err.println("Invalid senator");
            return;
        }
        Senator = senator;
    }

    public void setPopulation(double population) {
        if (population <= 0) {
            System.err.println("Invalid population");
            return;
        }
        this.population = population;
    }

    public void setStateTax(double stateTax) {
        if (stateTax < 0) {
            System.err.println("Invalid state tax");
            return;
        }
        this.stateTax = stateTax;
    }

    //*** toString ***
    @Override
    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", Senator='" + Senator + '\'' +
                ", population=" + population + " Million" +
                ", stateTax= %" + stateTax +
                '}';
    }

    //*** constructor ***

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }
}
