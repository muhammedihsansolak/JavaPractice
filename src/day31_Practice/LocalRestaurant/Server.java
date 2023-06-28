package day31_Practice.LocalRestaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }

    public void takeOrder(){
        System.out.println(name+" is taking order");
    }
    public void cleanTable(){
        System.out.println(name+" is cleaning table");
    }
    public void fullTimeStatus(){
        if (fullTime){
            System.out.println("Full-Time");
        }else {
            System.out.println("Part-Time");
        }
    }

    public static class Chef {

        public String name;
        public int employeeID;
        public double hourlyRate;
        public boolean fullTime;

        public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
            this.name = name;
            this.employeeID = employeeID;
            this.hourlyRate = hourlyRate;
            this.fullTime = fullTime;
        }

        public String toString() {
            return "Chef{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", hourlyRate=" + hourlyRate +
                    ", fullTime=" + fullTime +
                    '}';
        }

        public void makeOrder(){
            System.out.println(name+" is making order");
        }
        public void washDishes(){
            System.out.println(name+" is washes dishes");
        }
    }

    public static class Restaurant{
        public String owner, location;
        public int numberOfStars;
        public ArrayList<Server> servers = new ArrayList<>();
        public ArrayList<Chef> chefs = new ArrayList<>();

        public Restaurant(String owner, String location, int numberOfStars) {
            this.owner = owner;
            this.location = location;
            this.numberOfStars = numberOfStars;
        }

        public String toString() {
            return "Restaurant{" +
                    "Owner='" + owner + '\'' +
                    ", Location='" + location + '\'' +
                    ", number of stars=" + numberOfStars +
                    ", number of servers=" + servers.size() +
                    ", number of chefs=" + chefs.size() +
                    '}';
        }

        public void hireServer(Server server){
            servers.add(server);
        }

        public void hireChefs(Chef chef){
            chefs.add(chef);
        }

        public void terminateChef(int employeeID){
            chefs.removeIf(p -> p.employeeID == employeeID);
        }
    }

    public static class LocalRestaurant{
        public static void main(String[] args) {

            Restaurant myRestaurant= new Restaurant("Maxwell Ian","Oslo",5);

            Server server1= new Server("Zehra",12,25,true);
            Server server2 = new Server("Yasemin",13,26,true);

            Server[] servers = {server1,server2};

            myRestaurant.servers.addAll(Arrays.asList(servers));

            Chef chef1 = new Chef("Muhammed",1,30,true);
            Chef chef2 = new Chef("Hülya",2,35,false);

            Chef[] chefs = {chef1,chef2};

            myRestaurant.chefs.addAll(Arrays.asList(chefs));

            chef1.makeOrder();
            chef2.washDishes();

            server1.cleanTable();
            server2.takeOrder();


            Server server3 = new Server("Tuba",14,55,false);
            myRestaurant.hireServer(server3);
            server3.fullTimeStatus();

            System.out.println(myRestaurant);

        }
    }

}


