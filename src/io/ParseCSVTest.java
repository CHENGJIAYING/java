package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseCSVTest {

	public static void main(String[] args) {
		String a = "c:/java/greenew.csv";
		try ( 	//InputStreamReader isr = new InputStreamReader(new FileInputStream("C:/java/green.csv"));
				FileInputStream fis = new FileInputStream("C:/java/green.csv");   
				InputStreamReader isr = new InputStreamReader(fis,"UTF8");
				BufferedReader br = new BufferedReader(isr);
				BufferedWriter bw = new BufferedWriter(new FileWriter("c:/java/greenew.csv"));
				){
		
			String line=null;
			line = br.readLine();
			while (  (line = br.readLine() ) != null) {
				// String item[] = line.split(",");
				 bw.newLine();
				   bw.write(line);

				System.out.println(line);
			}
		//	bw.close();
			System.out.print("done");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
