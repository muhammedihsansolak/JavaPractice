package day43_Practice.shapeTask;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Invalid name: "+name);
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "shapeTask.Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

    public abstract double area();
    public abstract double perimeter();

}
