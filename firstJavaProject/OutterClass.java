package firstJavaProject;

public class OutterClass {
	private static int x=50;
	private final int y=27;
	
	private class Inner{
		void display() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	public static void main(String[] args) {
		x=28;
		OutterClass outer= new OutterClass();
		OutterClass.Inner inner= outer.new Inner();
		inner.display();
	}

}
