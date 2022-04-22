package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class TestFile {

	public static void main(String[] args) {

		
		
		
		
		File diRFile =new File("C:\\eclipse");
		File[] files = diRFile.listFiles();
		
		
		
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd ahh:mm:ss");
		int counter = 0;
		long size = 0;
		
		Set<File> set = new TreeSet<File>(new Comparator<File>() {

			@Override
			public int compare(File o1, File o2) {
				if (o1.length() > o2.length()) {
					return -1;
				}else if (o1.length() < o2.length()) {
					return 1;
				}
				return 0;
			}
		});
		
		for (File file : files) {
			long lastModified =file.lastModified();
			Date date = new Date(lastModified);
			System.out.printf(" %s:%s%n,修改時間:%s%n ", file.isDirectory()?"目錄":"檔名",file.getName(),format.format(date));
			if (!file.isDirectory()) {
				//如果是檔案
				counter++;
				size += file.length();
			}
		}
		
		System.out.printf("檔案個數:%d,大小總和:%d%n",counter,size);
		
		  for (File file : files ) {
	            System.out.printf("檔名:%s,大小:%d%n",file.getName(),file.length());
	        }
		
	}

}
