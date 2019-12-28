package firstJavaProject;

public class StringBufferOperations {

	public static void main(String[] args) {
		StringBuffer sub1= new StringBuffer("hello");
		sub1.append(" world");
		System.out.println(sub1);
		System.out.println(sub1.length());
		System.out.println(sub1.delete(7, 9));
		System.out.println(sub1.reverse());
		System.out.println(sub1.replace(2, 5, "one"));
		String str="my name is khan"; 
		StringBuffer sub2= new StringBuffer();
		sub2.append(str);
		System.out.println(sub2);
		String str2=sub2.toString();
		System.out.println(str2);
		StringBuilder builder= new StringBuilder();
		builder.append("abcdef");
		System.out.println(builder.toString());
		
	}

}
