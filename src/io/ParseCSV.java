package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseCSV {

	public static void main(String[] args) {

		try ( FileInputStream fis = new FileInputStream("C:/java/green.csv");   
				InputStreamReader isr = new InputStreamReader(fis,"UTF8");
				BufferedReader br = new BufferedReader(isr);
				){
		
			String line;
			line = br.readLine();
			//int sum = 0;
			while (  (line = br.readLine() ) != null) {
				System.out.println(line);
				
					//String[] fields = line.split(",");
				//	System.out.printf("姓名:%s,薪水:%s%n",fields[1],fields[2]);
			//	String[] columns = line.split(",");
			//	System.out.println(columns[0]);
			//		sum += Integer.parseInt(fields[2]);
			}
			//System.out.println( "總和="+sum);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
