package leetCodePractice.designHashMap;

import java.util.Iterator;
import java.util.LinkedList;

public class BucketLinkedList {

    LinkedList<KeyValue<Integer, Integer>> bucketList = new LinkedList<>();

    public int get(int key) {
        for (KeyValue<Integer, Integer> keyValue : bucketList) {
            if (keyValue.key == key) return keyValue.value;
        }
        return -1;
    }

    public void update(int key, int value) {
        //key-value exists, update its key
        boolean isExist = false;
        for (KeyValue<Integer, Integer> keyValue : bucketList) {
            if (keyValue.key == key) {
                isExist = true;
                keyValue.value = value;
            }
        }
        //if key-value doesn't exist, add it
        if (!isExist) {
            bucketList.add(new KeyValue<>(key, value));
        }
    }

    public void remove(int key) {
        bucketList.removeIf(pair -> pair.key == key);
    }

}
