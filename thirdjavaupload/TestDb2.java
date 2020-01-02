package thirdjavaupload;


import java.sql.*;

import oracle.jdbc.OracleDriver;

public class TestDb2 {

	public static void main(String[] args) {
	OracleDriver driver= new OracleDriver();
	int row=0;
	try {
		
		DriverManager.registerDriver(driver);
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con=DriverManager.getConnection(url, "scott", "tiger");
		System.out.println("done");
		String qry2="update employee set empname=?,salary=? where empnum=?";
		con=DriverManager.getConnection(url, "scott", "tiger");
		PreparedStatement pst=con.prepareStatement(qry2);
		int empId=11;
		String name="jjkl";
		double salary=500;
		pst.setInt(3, empId);
		pst.setString(1, name);
		pst.setDouble(2, salary);
		row += pst.executeUpdate();
		qry2="delete from employee where empnum=?";
		 pst=con.prepareStatement(qry2);
		pst.setInt(1, empId);
		row += pst.executeUpdate();
		con.close();
	} catch (SQLException  e) {
		
		e.printStackTrace();
	}
	System.out.println(row+" rows created");
	System.out.println("conected");
	}

}
