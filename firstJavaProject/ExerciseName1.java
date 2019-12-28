package firstJavaProject;

public class ExerciseName1 {

	public static void main(String[] args) {
		int namelen=args[0].length();
		for(int i=0;i<namelen;i++) {
			System.out.print(args[0].charAt(i));
			System.out.print("          ");
			for(int j=0;j<=i;j++) {
				System.out.print(args[0].charAt(j));
			}
			System.out.println();
		}
	}

}
