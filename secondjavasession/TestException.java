package secondjavasession;

import java.io.IOException;
import java.util.Scanner;

public class TestException {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner scanner= new Scanner(System.in);
		int x=7;
		int y=8;
		int a[]={5,6,7,8,9};
		scanner.close();
		try{
			int r=x/y;
			System.out.println("result = "+r);
			System.out.println("value = "+a[2]);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		}
		System.out.println("sucess");
		
		int empCode=1234;
		int input= Integer.parseInt(args[0]);
		try{
			if(empCode==input)
				System.out.println("employee found");
			else throw new EmployeeNotFoundException();
		}
		catch(EmployeeNotFoundException e){
			e.printStackTrace();
		}
	}

}
