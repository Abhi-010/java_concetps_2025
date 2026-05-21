package abstract_class_interfaces.interfaces.natwest;

public interface inter1 {

    // abstract method
    void absMethod() ;

    // default method
    default void defMethod(){
        System.out.println("this is a default Method of inter1");
    }

    default  void newDefMethod(){
        System.out.println("this is a new default method of inter1");
    }
}
