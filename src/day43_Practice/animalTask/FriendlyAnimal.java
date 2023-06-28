package day43_Practice.animalTask;

public abstract class FriendlyAnimal extends Animal {

    private final boolean isWild, isFriendly, isPlayable;

    public FriendlyAnimal(String name, String breed, String color, char gender, char size, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, gender, size, age);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public boolean isWild() {
        return isWild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", color='" + getColor() + '\'' +
                ", gender=" + getGender() +
                ", size=" + getSize() +
                ", age=" + getAge() +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }

    public abstract void play();
    public abstract void pet();
}
