
public class SecondClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello \"Vincent\" \nJava");// \" \r\n or \n
	
	double aa =10;
	double bb =3;
	int cc = (int) (aa / bb);
	System.out.println("cc="+cc);
	aa=aa+bb;//aa=13
	//aa+=bb;  (-= ,+= ,/= ,*=)
	System.out.println("aa="+aa);
	
	//int age =19;
	//boolean isAdult =(age !=18); // ==等於, !=不等於
	//System.out.println("成年?"+isAdult);
	
	int age =16;
	boolean isAdult =(age <18 || age >30); //&&且 || 或
	System.out.println("成年?"+! isAdult); // ! 相反的布林值
	
	System.out.println( age>=18? "成年" : "未成年"  ) ;//三元運算
	
	int sales = 2000;
	int salary =100;
	salary= sales > 1000 ? salary + 10 : salary - 10 ;//三元運算
	System.out.println("薪水="+ salary);//三元運算
	
	System.out.println(12 & 6); //bit wise 判斷
	System.out.println(12 | 6);//bit wise組合
	System.out.println(10<<1);// X 2^n(正負號不動)
	System.out.println(10>>1);// ÷ 2^n(正負號不動)
	
	age++;//age=age+1
	System.out.println("age="+ age);//age=age+1
	
	int x = 6 ;
	int y =10 ;
	int z = ++x * y-- ;
	System.out.println("Z="+z);//z=70 ,x=7 ,y=9
	
	
	}

}
