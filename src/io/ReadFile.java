package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

	try ( FileInputStream fis = new FileInputStream("C:\\java\\io_1.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
  ){
		
		System.out.println("availible = "+ fis.available());
		
		int b = fis.read();//讀第一個byte
		char c =(char) b;//把byte值轉成char(字)
		System.out.println("byte的值="+ b);
		System.out.println(c);
		
		while ( ( b = fis.read())!= -1) {
			c =(char) b ;
			System.out.println(c);
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}
		
		
		
		
	}


