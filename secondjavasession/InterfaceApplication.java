package secondjavasession;

public class InterfaceApplication implements One,Three{
	
	public static void main(String[] args) {
		System.out.println(One.X);
		System.out.println(Y);
		System.out.println(Three.X);
		One one= new InterfaceApplication();
		Three three= new InterfaceApplication();
		one.displaym1();
		three.displaym2();
		three.displaym3();
	}

	@Override
	public void displaym2() {
		System.out.println();
		System.out.println("inside method 2");
		System.out.println();
	}

	@Override
	public void displaym3() {
		System.out.println();
		System.out.println("inside method 3");
		System.out.println();
	}

	@Override
	public void displaym1() {
		System.out.println();
		System.out.println("inside method 1");
		System.out.println();
	}

}
