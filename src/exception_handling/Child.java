package exception_handling;

public class Child extends Base{
    public int value = 10;
    public void display(ChildService service){
        System.out.println("In child");
    }

    public void display(BaseService service){
        System.out.println("In child 2");
    }
}
