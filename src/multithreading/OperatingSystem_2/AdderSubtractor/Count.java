package multithreading.OperatingSystem_2.AdderSubtractor;

public class Count {
    private volatile int value = 0;

    public int getValue(){
        return value;
    }
    public void setValue(int value){
       this.value = value;
    }
}
