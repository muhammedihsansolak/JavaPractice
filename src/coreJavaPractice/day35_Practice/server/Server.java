package coreJavaPractice.day35_Practice.server;

public class Server {

    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean isFullTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 0) return;
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getHourlyRate() {

        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) return;
        this.hourlyRate = hourlyRate;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(isFullTime);
    }
    public void takeOrder(){
        System.out.println(name+" is taking order");
    }
    public void cleanTable(){
        System.out.println(name+" is cleaning table");
    }
    public void fullTimeStatus(){
        if (isFullTime){
            System.out.println("Full-Time");
        }else {
            System.out.println("Part-Time");
        }
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
