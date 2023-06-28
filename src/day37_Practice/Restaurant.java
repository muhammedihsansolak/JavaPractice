package day37_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    String owner, location;
    int numberOfStars;
    ArrayList<Server> servers = new ArrayList<>();
    ArrayList<Chef> chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    void hireServer(Server server){
        servers.add(server);
    }
    void hireServers(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
    }

    void hireChef(Chef chef){
        chefs.add(chef);
    }
    void hireChefs(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    void terminateServer(int id){
        servers.removeIf(p -> p.ID == id);
    }
    void terminateChef(int id){
        chefs.removeIf(p -> p.ID == id);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + servers.size() +
                ", number of chefs=" + chefs.size() +
                '}';
    }
}
