package thirdjavaupload;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

import oracle.jdbc.OracleDriver;

public class TestDB {

	public static void main(String[] args) {
	OracleDriver driver= new OracleDriver();
	int row=0;
	try {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		DriverManager.registerDriver(driver);
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con=DriverManager.getConnection(url, "scott", "tiger");
	/*	Statement st=con.createStatement();
		String qry="insert into employee values (1122,'abc',5000.97)";
		st.executeUpdate(qry);
		con.close();*/
		System.out.println("done");
		String qry2="insert into employee values(?,?,?)";
		 con=DriverManager.getConnection(url, "scott", "tiger");
		PreparedStatement pst=con.prepareStatement(qry2);
		int empId=11;
		String name="Adfad";
		double salary=5000;
		for (int i=0;i<5;i++){
			pst=con.prepareStatement(qry2);
			System.out.println("enter empid ");
			empId=Integer.parseInt(br.readLine());
			 
			System.out.println("enter name ");
			name=br.readLine();
			System.out.println("enter salary");
			salary=Double.parseDouble(br.readLine());
		
			
			pst.setInt(1, empId);
			pst.setString(2, name);
			pst.setDouble(3, salary);
			row += pst.executeUpdate();
		}
		con.close();
	} catch (SQLException | NumberFormatException | IOException e) {
		
		e.printStackTrace();
	}
	System.out.println(row+" rows created");
	System.out.println("conected");
	}

}
