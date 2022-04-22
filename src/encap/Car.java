package encap;

public class Car {

	//屬性寫上面  方法寫下面 較乾淨
	private String model;//隱藏起來
	private int price;
	private String color;
	//CONSTRUCTOR
	public Car(String color) {
		this("Yaris", color);
		//this.color = color;
		
	}
	
	public Car(String model, String color) {
		//this.model = model;
		this.color = color;
		SetModel(model);
	}
	
	
	public String getColor() {
		return color;
	}
	
	

	public void setColor(String color) {
		this.color = color;
	}

	//取得型號的方法
	public String getModel() {
		return model;
	}
	
	//也可用右鍵SOURCE-GETTER AND SETTER 直接列出
	//不開放設定price所以沒有setprice
	public int getPrice() {
		return price;
	}
	
	//屬性寫上面  方法寫下面 較乾淨
	//設定型號的方法
	public void SetModel(String model) {
		//同名的話用THIS來取得屬性
		this.model = model;
		if (model.equals("Yaris")) {
			this.price =575000;
		}else if (model.equals("Prius")) {
			this.price =1000000;
			
		}else {
			System.out.println("型號有錯,只能是Yaris or Prius");
		}
	
		
		
		
	}
	
	
	
}


