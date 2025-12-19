package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionMain {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        for (String item : list) {
            list.remove(item);  // This will throw ConcurrentModificationException
        }


        List<String> list1 = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");

        for (String item : list1) {
            list.remove(item);  // No exception thrown
        }


    }
}

