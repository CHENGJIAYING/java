package exception;

import java.io.File;
import java.io.FileNotFoundException;

public class TestException2 {

	public static void main(String[] args) {

		try {
			checkFile("C:/java/Hello.j12");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void checkFile(String path) throws FileNotFoundException {
		File file = new File(path);
		//!是將 false 變 true
		if (!file.exists()) {
			//產生一個FileNotFoundException的物件
			//FileNotFoundException fne = new FileNotFoundException(path+"檔案不存在") ;
				//用Throw把exception拋出	
			throw new FileNotFoundException(path+"檔案不存在") ;	
		}
		System.out.println("Check File Finish");
	}
}

