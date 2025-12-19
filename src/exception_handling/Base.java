package exception_handling;

public class Base {
    public int value = 20;
    public void display(BaseService service){
        System.out.println("In base using Base Service");
    }
    public void display(ChildService service){
        System.out.println("In Base using Child Service");
    }
}
