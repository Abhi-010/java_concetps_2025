package abstract_class_interfaces.interfaces.natwest;

public interface inter3 {
    default void defMethodInInter3(){
        System.out.println("this is a default method of inter3");
    }

    static void staticMethodInInter3(){
        System.out.println("this is a static method of inter3");
    }
}
