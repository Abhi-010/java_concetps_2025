package memory_in_java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");

        printList(myList);

        final Customer customer = new Customer("Abhi");
        customer.setName("Rahul");
        System.out.println(customer.getName());

//        const String s1 = "ONE";

    }
    public static void printList(List<String> data){
        String value = data.get(1);
        data.add("Four");
        System.out.println(data);
    }
}
