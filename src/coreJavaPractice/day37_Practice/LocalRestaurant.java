package coreJavaPractice.day37_Practice;

public class LocalRestaurant {
    public static void main(String[] args) {


        Restaurant myRestaurant = new Restaurant("Maxwell Ian","Ankara",5);

        Server s1 = new Server("Zehra",22,'F',13,67000,false);
        Server s2 = new Server("Ahmet", 24,'M',14,82000,true);

        s1.work();
        s1.cleanTable();
        System.out.println(s1);
        System.out.println(s2);

        Server[] servers = new Server[1];
        servers[0] = s2;

        myRestaurant.hireServer(s1);
        myRestaurant.hireServers(servers);

        Chef c1 = new Chef("Hülya",25,'F',15,100000,true);
        myRestaurant.hireChef(c1);
        c1.makeOrder();
        System.out.println(c1);

        System.out.println(myRestaurant);

        System.out.println("Workers ->");
        for (Server server : myRestaurant.servers) {
            System.out.print(server.name+" ");
        }
        for (Chef chef : myRestaurant.chefs) {
            System.out.print(chef.name+" ");
        }

    }
}
