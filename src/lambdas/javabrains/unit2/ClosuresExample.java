package lambdas.javabrains.unit2;

public class ClosuresExample {
	public static void main(String[] args) {
		int a = 10; // variable 'a' must be final (should not modify)
		int b = 20; // variable 'b' must be final (should not modify)

		// Java 7
		doProcess(5, new Process() {
			@Override
			public void process(int i) {
				System.out.println(a+i);
			}
		});
		//a = 5;

		// Java 8
		doProcess(a, i -> System.out.println(i + b));
		//b = 4;
	}
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
}

interface Process {
	void process(int i);
}
