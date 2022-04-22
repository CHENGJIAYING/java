package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.ZipException;

public class TestCheckException {

	
	//public static void main(String[] args) throws FileNotFoundException,ZipException {
		//丟出父類別 IOException
		public static void main(String[] args) throws IOException {
			//工具直接叫出
	/*	try {
			FileReader fileReader = new FileReader("c:\\java\\Hello.jar");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		FileReader fileReader = new FileReader("c:\\java\\Hello.jar");
		System.out.println("done");
	}

}
