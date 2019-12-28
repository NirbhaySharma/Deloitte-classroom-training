package firstJavaProject;

public class ArraysTest {

	public static void main(String[] args) {
		int[] x= new int[5];
		int[] y = {10,12,14,16,18};
		for(int i=0 ;i<5;i++) {
			x[i]=i+2;
			System.out.println(x[i]+"  "+y[i]);
		}
		
	}

}
