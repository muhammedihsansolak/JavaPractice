package day39_Practice.Animal;

public class FriendlyAnimal extends Animal {

    private boolean isWild, isFriendly, isPlayable;

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public FriendlyAnimal(String name, String breed, String color, char gender, char size, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, gender, size, age);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
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
    public void play(){
        System.out.println(getBreed()+" "+getName()+" loves to play");
    }
    public void pet(){
        System.out.println(getBreed()+" "+getName()+" is eligible for being pet");
    }

}
