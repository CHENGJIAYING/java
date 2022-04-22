package interFace;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Product {
	
	public static final double TAX = 0.05;
	
	static {
		System.out.println("Product's static block");
	}
	
	
	  protected String name;//protected 同一個package就可以直接用屬性 但子類別就沒限制
	  protected int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
//防止super呼叫到沒有參數的
	public Product() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String desc() {
		return String.format("商品名稱:%s,價錢:NT$%d元", this.name, this.price);
	}
	
	//抽象方法
	//public abstract int calcTotal();
	
	public static Date getDate(int year , int month , int day  ) {
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		Date expDate = calendar.getTime() ;//要用util
		return expDate;
	}
}
