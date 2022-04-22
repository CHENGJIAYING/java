

public class Test { 
	//static private int i = 1;
	public static void main(String argv[]){
		
	/*	
		 i = 2;
		Test s = new Test(); 
    s.print();
	}
	public static void print(){
		System.out.println(i); 
		*/
		
		int sales = 2000;
		int salary = 100;
		salary = sales>1000? salary+10 : salary-10;
		System.out.println("薪水="+salary);
		int age = 17;
		/*		
		if (age>=65) {System.out.println("老年");
		}else if(age>=30) {System.out.println("壯年");
		}else if (age>=18){System.out.println("成年");
		}else {System.out.println("未成年");}
		*/
		
		if (age>=18) {
			System.out.println("成年");
			if (age>=30) {
				System.out.println("壯年");
				
			}
		}else {
			System.out.println("未成年");
		}
		int BMI = 5;
		switch (BMI) {
		case 1:
			System.out.println("BMI=20");
			break;
		case 2:
			System.out.println("BMI=15");
			break;
		case 3:
			System.out.println("BMI=26");
			break;
		case 4:
			System.out.println("BMI=28");
			break;
		case 5:
			System.out.println("BMI=30");
			break;
		default:
			System.out.println("未建檔");
			break;
		}
	/*
		for (int i = 50; i <= 100; i+=2) {
			System.out.println("開始計算次數 = "+i);
		}
		System.out.println("i迴圈結束");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				continue;//跳過此次進行下個迴圈
			}
			if (i>=50) {break;
				
			}
			System.out.println("i="+i);
			sum = sum + i;
		}
		System.out.println("總和="+sum);
	 */
 	for (int i = 1; i <= 9 ; i++) {
		for (int j = 1; j <= 9 ; j++) {
			System.out.print(i + "X" + j + "=" + i*j + "\t");
		}
		System.out.println();
	}
				System.out.println("資策會204".substring(0, 5));
		
	}
}