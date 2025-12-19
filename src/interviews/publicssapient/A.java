package interviews.publicssapient;

public class A {
    A(){
        System.out.println("Constructor");
    }
    static {
        System.out.println("static");
    }
    {
        System.out.println("commenct..");
    }

    public static void main(String[] args){
        System.out.println("Calling form main..");
    }
}
