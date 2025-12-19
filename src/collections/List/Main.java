package collections.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(3);
        arrayList.add(2);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(1);
        linkedList.add(8);

        //Collections.sort(linkedList);
//        Iterator i = linkedList.iterator();
//        while(i.hasNext()){
//            System.out.print(i.next() + " ");
//        }

//        ListIterator listIterator = linkedList.listIterator(linkedList.size());
//        while(listIterator.hasPrevious()){
//            System.out.print(listIterator.previous() + " ");
//            //System.out.println("hi");
//        }

        for(Integer i : linkedList){
            System.out.println(i);
        }


    }
}
