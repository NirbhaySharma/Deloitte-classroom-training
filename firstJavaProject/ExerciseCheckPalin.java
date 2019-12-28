package firstJavaProject;

public class ExerciseCheckPalin {

	public static void main(String[] args) {
		String str=args[0];
		String str2=args[0];
		StringBuffer sb= new StringBuffer();
		sb.append(str);
		sb=sb.reverse();
		
		str=sb.toString();
		if(str2.equals(str))
			System.out.println("input is palindrome");
		else System.out.println("input is not palindrome");
	}

}
