package io;

import java.io.*;
import java.nio.charset.Charset;
//sample摳過來的
public class ReadByFileReader {
    public static void main(String[] args) throws IOException {

        System.out.println("JVM Encoding＝"+Charset.defaultCharset());

        File file = new File("C:\\java\\char_MS950.txt");
        try( FileInputStream fis = new FileInputStream(file);
        		InputStreamReader isr = new InputStreamReader(fis,"MS950");
        		BufferedReader br = new BufferedReader(isr)
        //(FileReader fr = new FileReader(file)
        		){
        	////可以讀很多行 系統預設最後讀不到是回傳null所以設定不等於null的while迴圈就可列出
        	String line;
            while ( (line = br.readLine()) != null) {
            System.out.println(line);
            }
            
            
            
            
                int c;
                while ((c = br.read()) != -1) {
                    System.out.println((char) c);
                }
            //}

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
