package diamond_problem_in_java.withinterface;

public interface C extends A{
    default void show() {
        System.out.println("Show method in B");
    }
}
