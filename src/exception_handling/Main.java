package exception_handling;


public class Main {
    public static void main(String[] args) {
        Base base = new Child();
        base.display(new ChildService());
        base.display(new BaseService());
    }
}
