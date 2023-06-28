package shapeTask;

public class Shape{
    //instance variables
    private final String name;


    //---getters---
    public String getName(){
        return name;
    }

    //---constructor---
    public Shape(String name){
        if (name.isEmpty() || name.isBlank()) throw new RuntimeException("Invalid name: "+name);
        this.name = name;
    }
    //---toString---
    @Override
    public String toString(){
        return "Shape{" +
                "name = " + name +
                ", area = "+ area() +
                ", perimeter = "+perimeter()+
                "}";
    }
    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }
}
