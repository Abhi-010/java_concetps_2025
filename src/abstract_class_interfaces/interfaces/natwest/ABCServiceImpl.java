package abstract_class_interfaces.interfaces.natwest;

public class ABCServiceImpl implements inter1, inter2{

    @Override
    public void absMethod() {
        System.out.println("abstract method implemented in ABCServiceImpl");
    }

    @Override
    public void defMethod() {
        inter1.super.defMethod();
        inter2.super.defMethod();
        System.out.println("returning from inter1");
    }
}
