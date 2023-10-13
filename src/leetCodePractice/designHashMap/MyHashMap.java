package leetCodePractice.designHashMap;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {

    //for hashing function and number of buckets
    private int modulusNumber = 2341;

    //to solve collisions
    List<BucketLinkedList> list = new ArrayList<>();

    public MyHashMap() {
        for (int i = 0; i < modulusNumber; i++) {
            list.add( new BucketLinkedList() );
        }
    }
    public int get(int key) {
        int index = key % modulusNumber;
        return list.get(index).get(key);
    }

    public void put(int key, int value) {
        int index = key % modulusNumber;//calculate index with hashing function
        list.get(index).update(key, value);
    }

    public void remove(int key){
        int index = key % modulusNumber;
        list.get(index).remove(key);
    }



}
