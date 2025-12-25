package multithreading.OperatingSystem_2.AdderSubtractor;

public class Adder implements Runnable {
    private Count count ;
    public Adder(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 1 ; i <= 10000 ;i++){
            int currentValue = count.getValue();
            int nextValue = currentValue + i;

            count.setValue(nextValue);
        }
    }
}
