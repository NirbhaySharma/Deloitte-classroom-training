package firstJavaProject;

public class StudentExam extends LibraryDetails{
		private int sub1;
		private int sub2;
		private int sub3;
		private int total;
		
		
	public StudentExam(int regno,String name, String group,int booksDue,int sub1, int sub2, int sub3) {
			super(regno,name,group,booksDue);
			this.sub1 = sub1;
			this.sub2 = sub2;
			this.sub3 = sub3;
			setTotal();
		}
	
	void output(){
		System.out.println("regno is : "+regno);
		System.out.println("name is : "+name);
		System.out.println("group is : "+group);
		System.out.println("marks for subject 1 : "+sub1);
		System.out.println("marks for subject 2 : "+sub2);
		System.out.println("marks for subject 3 : "+sub3);
		System.out.println("marks for all subjects : "+total);
		System.out.println("marks for all subjects : "+total);
		System.out.println("number of books issued : "+booksDue);
		
	}
	
	void setTotal(){
		total=sub1+sub2+sub3;
	}
	
	public static void main(String[] args) {
		int regno=1234;
		String name= "dilip";
		String group="ECE";
		int sub1 =68;
		int sub2 =78;
		int sub3 =88;
		int booksDue=5;
		Student stu1= new Student(regno,name,group);
		Student stu= new StudentExam(regno,name,group,booksDue,sub1,sub2,sub3);
		stu.display();
		stu.output();
		stu=stu1;
		System.out.println();
		System.out.println();
		stu.output();
		
	}

}
