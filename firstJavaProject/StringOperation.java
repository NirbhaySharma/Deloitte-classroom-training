package firstJavaProject;

public class StringOperation {

	public static void main(String[] args) {
		String str1="deloitte";
		System.out.println("length "+ str1.length());
		System.out.println(str1.lastIndexOf('d'));
		System.out.println(str1.charAt(0));
		System.out.println(!str1.isEmpty());
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,4));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.concat(" i am here"));
		System.out.println(str1);
		System.out.println(str1.compareTo("deloitte"));
		System.out.println(str1.equals("Deloitte"));
		
	}

}
