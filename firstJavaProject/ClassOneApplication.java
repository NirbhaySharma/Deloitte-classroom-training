package firstJavaProject;

public class ClassOneApplication extends ClassOne{

	public ClassOneApplication(int x, int y) {
		super(x, y);
		
	}

	public static void main(String[] args) {
		ClassOne classOne=new ClassOneApplication(5,6);
		classOne.output();
		System.out.println("super class defined variables x and y are :"+classOne.x+","+classOne.y);
		classOne.display();
	}

	@Override
	void output() {
		System.out.println("inside child class of abstract parent class");
		
	}

}
