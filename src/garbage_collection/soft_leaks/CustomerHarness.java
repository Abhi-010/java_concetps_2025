package garbage_collection.soft_leaks;

public class CustomerHarness {
    public static void main(String[] args) {
        CustomerManager cm = new CustomerManager();
        GenerateCustomerTask task = new GenerateCustomerTask(cm);

        for(int user = 0 ; user < 10 ; user++){
            Thread t = new Thread(task);
            t.start();
        }

        while(true){
            try{
                Thread.sleep(5000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            cm.howmanyCustomers();
            System.out.println("Available Memory " + Runtime.getRuntime().freeMemory()/1024 + "k");
        }

    }
}
