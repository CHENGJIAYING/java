package func;

public class TestFunc {

	public static void main(String[] args) {
	
		int sum =add(1,2);
		System.out.println("Sum=" + sum);
		

	}
	//兩個整數相加   	回傳型態	方法名稱	參數,輸入值		方法的定義
	public 	static   int      add   (int a, int b) {
	int s = a + b;
	return s;//有回傳就要有return 且形態要相等
	}
}
