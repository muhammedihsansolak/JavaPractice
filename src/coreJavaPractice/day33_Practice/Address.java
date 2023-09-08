package coreJavaPractice.day33_Practice;

public class Address {

    public static String country = "US", planet = "Earth (the blue planet)";
    public String street, city, state;
    public int zipCode;

    public Address(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString(){
        return  street+"\n"+ city +" "+ state + ", "+zipCode;
    }

    public static void main(String[] args) {
        Address myAddress = new Address("7925 Jones Branch Dr","McLean","VA",22012);
        System.out.println(myAddress);
    }
}
