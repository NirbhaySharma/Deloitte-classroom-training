package javaAssessmentOne;

public class Rectangle extends Shape {
	//class extends Shape
	
	//constructors
	Rectangle (){
		super();
	}
	Rectangle(double length,double breadth){
		super(length,breadth);
	}
	
	
	@Override
	void area() {
		double areaAnswer=length*breadth;  //area calculation for rectangle
		System.out.println();
		System.out.println("The area of the Rectangle is : "+areaAnswer);// answer
		System.out.println();
	}

}
