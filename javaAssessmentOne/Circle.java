package javaAssessmentOne;

public class Circle extends Shape{
	//extends Shape
	
	// class variable 
	final static private double  pi=3.142857;// pi value
	
	//constructors
	Circle(){
		super();
	}
	Circle(double radius){
		super(radius);
	}
	
	
	@Override
	void area() {
		double areaAnswer=pi*radius*radius;  //area calculation
		System.out.println();
		System.out.println("The area of the circle is : "+areaAnswer);  //printing answer
		System.out.println();
	}
}
