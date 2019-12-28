package javaAssessmentOne;

public abstract class Shape {
		
		//instance variables 
		protected double length;
		protected double breadth;
		protected double radius;
		
		//constructors
		public Shape() {
			this.length = 0.0;
			this.breadth =0.0;
			this.radius = 0.0;
		}

		public Shape(double length, double breadth) {
			this.length = length;
			this.breadth = breadth;
			this.radius = 0.0;
		}
		
		public Shape(double radius) {
			this.length = 0.0;
			this.breadth =0.0;
			this.radius = radius;
		}
		
		//abstract method
		abstract void area();
		
}
