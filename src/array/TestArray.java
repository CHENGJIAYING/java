package array;

import java.util.Iterator;

public class TestArray {

	public static void main(String[] args) {
		int a = 1 ;
		System.out.println(a);
		
		//int[] ages =new int [10];   //陳列是物件,new
		int[] ages = {1,2,3,4};   //陳列是物件,new
		ages[0] = 1;
		ages[1] = 2;
		ages[2] = 3;//設定陣列中的值[index],0起算  0...9 (10不在範圍)
		System.out.println(ages[2]);
		System.out.println(String.format("陣列長度=%d", ages.length));
		System.out.printf("陣列長度=%d%n",ages.length);	//非LN不會自動換行 %n手動換行	
		System.out.println(ages[3]);//非定義範圍但陣列有預設值為0
		//System.out.println(ages[10]);//ArrayIndexOutOfBoundsException
				
		//int [][] x = new int[5][4];
		int [][] x = {{1,2,3} , {4,5,6} , {7,8,9} };
		x[0][0] = 1 ;
		x[1][0] = 2 ;
		x[2][0] = 3 ;
		System.out.println(x[1][0]);
		System.out.println("總共有"+x.length+"排");
		System.out.println("第0排有"+x[0].length+"個");
		
		//int i = 0; //i表示第幾排
		for (int i = 0; i < x.length; i++) {
			for (int j = 0 ;  j  <  x[i].length ; j++) {
				System.out.printf("x[%d][%d]=%d ",i,j,x[i][j]);
		}
		System.out.println(); //換行
		
		//number是int[] ,每一個元素都是int
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		for (int item : numbers) {
			System.out.println(item);
		}
		System.out.println("=================");
		for(int[] row : x) {
			//System.out.println(row);
			//row = 0
			for(int item : row) {
				System.out.println(item);
			}
		}
		
	
		
		}
		
		
	}

}
