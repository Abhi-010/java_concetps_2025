package lambdas.javabrains.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
	
		//Thread t = new Thread(MethodReferenceExample1::printMessage);  // () -> method()
		Thread t = new Thread(()-> System.out.println("hello"));  // () -> method()
		// Thread t1 = new Thread(new someTask()) ;
		//Thread t1 = new Thread(()-> System.out.println("hello")) ;
		// MethodReferenceExample1::printMessage === () -> printMessage()
		t.start();
	}
	
	
	public static void printMessage(int i) {
		System.out.println("Hello");
	}
}

class someTask implements Runnable{
	@Override
	public void run() {
		System.out.println("hello hi r u fine ?");
	}
}
