package firstJavaProject;

public class MethodOverloading {
	 static void add(int x, int y) {
		System.out.println(""+(x+y));
		System.out.println();
	}
	 static void add(double x,double y) {
		System.out.println(""+(x+y));
		System.out.println();
	}
	 static	void add(String x, String y) {
		System.out.println(""+(x+y));
		System.out.println();
	}
	public static void main(String[] args) {
		MethodOverloading.add(1,2);
		MethodOverloading.add(100.5,209.3);
		MethodOverloading.add("Hello ","World");
		
	}
}
