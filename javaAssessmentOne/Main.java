package javaAssessmentOne;

public class Main {

	public static void main(String[] args) {
		//receiving values from command line
		double length=Double.parseDouble(args[0]);
		double breadth=Double.parseDouble(args[1]);
		double radius=Double.parseDouble(args[2]);
		
		//Rectangle object 
		Rectangle rectangle= new Rectangle(length,breadth);
		rectangle.area();
		
		
		//circle Object
		Circle circle= new Circle(radius);
		circle.area();
		
		
	}

}
