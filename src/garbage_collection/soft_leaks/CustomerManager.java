package garbage_collection.soft_leaks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerManager {
    private List<Customer> customers = new ArrayList<>();
    private int nextId = 0 ;

    public void addCustomer(Customer customer){
        synchronized (this){
            customer.setId(nextId);
            nextId++;
        }
        customers.add(customer);
    }

    public Customer getNextCustomer(){

        return customers.get(0);

//        Customer result = null;
//        synchronized (this){
//            if(customers.size() > 0){
//                result = customers.remove(0);
//            }
//        }
//        return result ;

    }

    public void howmanyCustomers(){
        int size = 0 ;
        size = customers.size() ;
        System.out.println("" + new Date() + ":" + size);
    }

    public void displayCustomer(){
        synchronized (customers){
            for(Customer c : customers){
                System.out.println(c.toString());
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
