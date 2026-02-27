package internals_hashmap;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        HashMap<Customer,String> map = new HashMap<>();
        Customer c1 = new Customer("Abhi", 123l) ;
        Customer c2 = new Customer("Abhi", 221l);
        Customer c3 = new Customer("Abhi", 111l) ;


        map.put(c1,"A");
        map.put(c2,"B");
        map.put(c3,"C");
        map.put(null,"D");
        map.put(null,"E");
        map.entrySet().forEach(System.out::print);
    }
}
