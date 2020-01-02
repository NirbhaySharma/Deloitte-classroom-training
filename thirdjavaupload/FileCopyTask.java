package thirdjavaupload;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTask {

	public static void main(String[] args) {
		try {
			FileOutputStream file= new FileOutputStream("D:\\JavaFileFolder\\copyFile");
			FileInputStream fileip=new FileInputStream("D:\\test_exercise2.sql");
			int x;
			while((x=fileip.read())!=-1){
				file.write(x);
			}
			file.close();
			fileip.close();
			System.out.println("sucess");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
