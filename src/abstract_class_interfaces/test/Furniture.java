package abstract_class_interfaces.test;

public abstract class Furniture {
    private int var ;
    public Furniture(){
        System.out.println("this is constructor of Furniture...");
    }

    public int getVar() {
        return var;
    }

    public abstract void someMethod();

}
