package coreJavaPractice.day39_Practice.Animal;

public class WildAnimal extends Animal{
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

    public WildAnimal(String name, String breed, String color, char gender, char size, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, gender, size, age);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
    }

    public void hunt(String pray){
        System.out.println(getBreed()+" "+getName()+" loves to hunt "+pray);
    }
}
