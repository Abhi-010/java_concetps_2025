package abstract_class_interfaces.interfaces.natwest;

public interface inter1 {

    void absMethod() ;

    default void defMethod(){
        System.out.println("this is a default Method of inter1");
    }
}
