import java.util.jar.Attributes.Name;

public class TestString {

	public static void main(String[] args) {

		String name = "Vincent";// 99%用這個
		String name1 = "Vincent";
		System.out.println(name == name1);// 已經有就不會再產生新的 回傳既有的

		String name2 = new String("Vincent");// in heap not in pool

		System.out.println(name == name2);// 位置來源不同

		String name3 = new String("Vincent");// in heap not in pool
		System.out.println(name2 == name3);// NEW的話都會新建所以位置來源一樣不同

		String hello = "hello"; // pool
		String world = "world"; // pool
		String helloworld = "helloworld"; // pool
		String helloworld2 = hello + world; // 合併

		System.out.println(helloworld == helloworld2); // 文字串接另外生成HELLOWORLD(HEAP,同NEW一樣作用 immutable

		System.out.println(name.equals(name2));// 文字內容比較用EQUALS

		// length
		System.out.println("abc中文".length()); // 取得文字的長度

		System.out.println("abc中文".indexOf("a"));// 找得到從0起算 找不到 -1
		System.out.println("abc中文".contains("c"));// TRUE FALSE
		System.out.println("abcd中文".substring(3));// "中文" 從0起算所以3是第四位
		System.out.println("abcd中文".substring(3, 5));// "中文" 從0起算所以3是第四位 指定位不取

		Double a = 123.4567890123;
				System.out.println(a);
				System.out.println(String.format("%s有NT$%.4f元,花了%d元", name , a , 10));
				
		
		
		
	}

}
