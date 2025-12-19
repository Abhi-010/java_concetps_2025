package abstract_class_interfaces.interfaces.natwest;

abstract public interface inter2 {
    void absMethod() ;

    default void defMethod(){
        System.out.println("this is a def Method of inter2");
    }

       default void staticMethod(int x){
        System.out.println("In static Method : " + 2*x);
    }
}
