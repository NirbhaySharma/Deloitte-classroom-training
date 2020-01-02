package thirdjavaupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingAndREading {

	public static void main(String[] args) {
		File file= new File("D:\\JavaFileFolder\\fileInput");
		//file.mkdir();
		
			try {
				FileOutputStream fos= new FileOutputStream(file);
				for(int i=65;i<91;i++){
					fos.write(i);
				}
				fos.write(10);
				for(int i=65;i<91;i++){
					fos.write(i);
				}
				fos.close();
				System.out.println("Writing sucessfull");
				System.out.println();
				FileInputStream fis= new FileInputStream(file);
				int i=0;
				while((i=fis.read())!=-1){
					if(i==10)
						System.out.println();
					else
						System.out.print(((char)i)+" ");
					
				}
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

}
