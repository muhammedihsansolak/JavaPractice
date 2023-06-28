package day36_Practice.sportTask;

public class Sport {
    String name, rules;
    int numberOfPlayers, numberOfRules;

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRules=" + numberOfRules +
                '}';
    }

    public void setInfo(String name, String rules, int numberOfPlayers, int numberOfRules) {
        this.name = name;
        this.rules = rules;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRules = numberOfRules;
    }
    void play(){
        System.out.println("Playing "+name+" is fun");
    }
}
