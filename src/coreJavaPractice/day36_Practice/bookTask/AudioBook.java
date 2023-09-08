package coreJavaPractice.day36_Practice.bookTask;

public class AudioBook extends Book{

    String length, narrator;
    public void listen(){
        System.out.println(title+ " which is narrated by "+narrator+" is being listening");
    }
}
