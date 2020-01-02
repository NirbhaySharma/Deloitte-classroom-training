package thirdjavaupload;

import java.sql.*;
import oracle.jdbc.OracleDriver;

public class ResultSetExample {
	
	public static void main(String[] args) {
		OracleDriver driver= new OracleDriver();
		int row=0;
		try {
			DriverManager.registerDriver(driver);
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			Connection con=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("conected");
			String qry2="select * from employee";
			con=DriverManager.getConnection(url, "scott", "tiger");
			PreparedStatement pst=con.prepareStatement(qry2);
			ResultSet rs= pst.executeQuery(qry2);
			ResultSetMetaData rsmd= rs.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++){
				System.out.print( rsmd.getColumnName(i)+" ");
			}
			System.out.println();
			System.out.println("-------------------------");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
				row++;
			}
			con.close();
			System.out.println(row +" rows");
			System.out.println("done");
		} catch (SQLException  e) {
			
			e.printStackTrace();
		}
		
		
	}

}
