package secondjavasession;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {
		String dob="26-08-1997";
		Date dt= new Date();
		System.out.println(dt); // print sys date
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		dt=sdf.parse(dob);
		System.out.println(dt);
	}

}
