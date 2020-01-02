package thirdjavaupload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeObject {

	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream obb=null;
	
		try {
			fis=new FileInputStream("D:\\JavaFileFolder\\CustomerObjects");
			obb= new ObjectInputStream(fis);
			Object object;
			Customer cust;
			while((object=obb.readObject())!= null){
				cust=(Customer)object;
				System.out.println(cust.getCustId()+" "+cust.getName()+" "+cust.getComm());
			}
			System.out.println("sucess");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				fis.close();
				obb.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
