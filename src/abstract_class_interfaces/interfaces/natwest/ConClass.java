package abstract_class_interfaces.interfaces.natwest;

public class ConClass implements inter1, inter2 {

    @Override
    public void absMethod() {
        System.out.println("absMethod...");
    }

    @Override
    public void defMethod() {
        inter1.super.defMethod();
        inter2.super.defMethod();
        System.out.println("returning from inter1");
    }


}
