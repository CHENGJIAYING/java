import java.util.Iterator;

public class TestForByself {

	public static void main(String[] args) {
		//int i= 放大括弧外才可用
		//i:計數器
		//for (int i = 0; i < args.length; i++)
		int sum =0;//紀錄總和
		for( int i= 1 ; i <=100 ; i++ ) {
			if (i%2 == 0) {
				 continue;
			}
			if (i>=50) {
				break;//迴圈立即停止
			}
			System.out.println("i="+i);
			sum = sum + i;
			//i=1, sum = 0 + 1 = 1
			//i=2, sum = 1 + 2 = 3
			//i=3, sum = 3 + 3 = 6
			//      .
			//      .
			//      .
		}
		System.out.println("sum="+ sum);
		//System.out.println("finally i="+ i);放大括弧外才可用
		
		int i = 0;
		int sumOfwhile = 0;
		while (i<=100) {
			sumOfwhile += i;
			i++;
		}
		System.out.println("SumOfWhile ="+ sumOfwhile);
		
		i = 0;
		int SumOfDoWhile = 0 ;
		do {
			SumOfDoWhile += i;
			i++;
		} while (i<=100);
		System.out.println("SumOfDoWhile ="+ SumOfDoWhile);
		//dowhile至少會做一次再判斷
		
		
		
		
		
	}

}
