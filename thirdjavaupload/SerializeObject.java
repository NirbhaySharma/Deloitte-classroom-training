package thirdjavaupload;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObject {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream obb=null;
		try {
			fos= new FileOutputStream("D:\\JavaFileFolder\\CustomerObjects");
			Customer customer1= new Customer(101,"Deloitte",5500.0);
			Customer customer2= new Customer(202,"nexwave",500.0);
			obb= new ObjectOutputStream(fos);
			obb.writeObject(customer1);
			obb.writeObject(customer2);
			System.out.println("sucess");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				obb.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
