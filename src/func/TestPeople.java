package func;

public class TestPeople {

	public static void main(String[] args) {
		
		System.out.println("overweightBMI="+People.overweightBMI);
		double b = People.BMI(80, 1.7);
		System.out.println("static bmi="+b);
		
		
		
		People p = new People();//id=32
		p.height =1.7;
		p.weight =80;
		double bmi = p.getBMI();
		System.out.println("BMI ="+bmi);
		//靜態方法 會以斜體表示
		System.out.println(String.join(",","hello","Vincent"));
		System.out.println(  "中文abc".length()  );//物件方法
		
		
		
		
	}

}
