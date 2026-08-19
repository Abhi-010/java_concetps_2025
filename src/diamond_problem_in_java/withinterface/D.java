package diamond_problem_in_java.withinterface;

public class D implements B,C{

    @Override
    public void show() {
        System.out.println("your logic aslo...");
        C.super.show() ;
        B.super.show();
        System.out.println("your logic also..");
    }
}
