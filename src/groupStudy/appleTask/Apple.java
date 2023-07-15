package groupStudy.appleTask;

public class Apple {
    private int weight;
    private Color color;

    public int getWeight() {
        return weight;
    }

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
