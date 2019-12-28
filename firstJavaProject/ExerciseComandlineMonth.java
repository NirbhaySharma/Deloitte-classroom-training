package firstJavaProject;

public class ExerciseComandlineMonth {

	public static void main(String[] args) {
		String month=args[0];
		month=month.toLowerCase();
		switch(month) {
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december":	System.out.println("31 days");
							break;
		
		case "february":	System.out.println("28 days");
						break;
				
		case "april":
		case "june":
		case "september":
		case "november":	System.out.println("30 days");
							break;
		default :System.out.println("wrong input");
			
		}
		
	}

}
