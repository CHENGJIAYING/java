package func;

public class People {
	static double overweightBMI = 24;//常數 類別屬性 不會變動
	//靜態方法 (STATIC METHOD)不能使用物件等級的屬性或方法,資料必須從參數傳入 
	public static double BMI(double w , double h) {
		//不能使用物件等級的屬性或方法
		return w /(h *h);
	}
		
	//物件
	double height;
	double weight;
	//     回傳型態  名字()沒有參數
	public double getBMI() {

		//double bmi = weight / (height*height);
		double bmi = People.BMI(weight, height);
		return bmi;
	}
		//
}
