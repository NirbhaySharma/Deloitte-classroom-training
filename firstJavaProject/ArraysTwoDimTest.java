package firstJavaProject;

public class ArraysTwoDimTest {

	public static void main(String[] args) {
		int[][] x= new int [3][3];
		int[][] z= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] productArray=new int [3][3];
		int temp;			// Declaration
		
		
		
		for(int i=0;i<3;i++) {
			for(int y=0;y<3;y++) {
				x[i][y]=i+y;  // allocation 
			}
			
		}
		for(int i=0;i<3;i++) {
			int j=0;
			
			for(j=0;j<3;j++) {
				temp=0;
				for(int k=0;k<3;k++) {
					temp+=x[i][k]*z[k][j];
				}
				productArray[i][j]=temp;	
			}
			
		}
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.print("      ");
			for(int j=0;j<3;j++) {
				System.out.print(z[i][j]+" ");
			}
			if(i==1)
				System.out.print(" Product--->     ");
			else    System.out.print("                 ");
			for(int j=0;j<3;j++) {
				System.out.print(productArray[i][j]+" ");
			}
		System.out.println();	
		}
	}
}
