package firstJavaProject;

public class Main {

	public static void main(String[] args) {
		System.out.println("Personal Details");
		System.out.println("name : Nirbhay Sharma");
		System.out.println("mobile :7006906795");
		System.out.println("city : Jammu");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//Student Result class operations
		StudentResult student=new StudentResult(1,30,50,65);
		int total = student.getTotal();
		int avrage=student.getAvrage();
		if(avrage==0) {
			System.out.println("student regno is :"+student.getRegno());
			System.out.println("student total marks ="+total);
			System.out.println("student is fail");
			return;
			}
		System.out.println("student regno is :"+student.getRegno());
		System.out.println("student total marks ="+total);
		System.out.println("student is pass his avrage = "+avrage);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
	}

}
