package firstJavaProject;

public class Student {
		protected int regno;
		protected String name;
		protected String group;
		public Student(int regno, String name, String group) {
			this.regno = regno;
			this.name = name;
			this.group = group;
		}
		void output(){
			System.out.println("regno is : "+regno);
			System.out.println("name is : "+name);
			System.out.println("group is : "+group);
		}
		void display(){
			System.out.println("regno is : "+regno);
			System.out.println("name is : "+name);
			System.out.println("group is : "+group);
			System.out.println();
			System.out.println();
		}
		
	
}
