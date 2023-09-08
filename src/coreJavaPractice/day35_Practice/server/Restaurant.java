package coreJavaPractice.day35_Practice.server;

import coreJavaPractice.day31_Practice.LocalRestaurant.Server;

import java.util.ArrayList;

public class Restaurant {
    private String owner, location;
    private int numberOfStars;
    private ArrayList<Server> servers = new ArrayList<>();
    private ArrayList<Server.Chef> chefs = new ArrayList<>();

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    public void setServers(ArrayList<Server> servers) {
        this.servers = servers;
    }

    public ArrayList<Server.Chef> getChefs() {
        return chefs;
    }

    public void setChefs(ArrayList<Server.Chef> chefs) {
        this.chefs = chefs;
    }

    public Restaurant(String owner, String location, int numberOfStars) {
        setOwner(owner);
        setLocation(location);
        setNumberOfStars(numberOfStars);
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireChefs(Server.Chef chef) {
        chefs.add(chef);
    }

    public void terminateChef(int employeeID) {
        chefs.removeIf(p -> p.employeeID == employeeID);
    }
}
