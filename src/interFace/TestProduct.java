package interFace;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import category.Item;

public class TestProduct {

	public static void main(String[] args) {
		
		
		Notebook nb = new Notebook("Asus", 30000, 365);
		
		
		
		System.out.printf("名稱:%s,價格:%d,保固天數:%d%n",nb.getName(),nb.getPrice(),nb.getWarranty());
		//System.out.println(nb.name);//同一個package才能
		//System.out.println(nb.desc());
		
		Product item = nb;//notebook是一種product
		System.out.println(item.desc());
		//喜歡用父類的方法 Product.desc()去操作子類Notebook的物件
//		item.getWarranty();//選不到 雖然實際操作的物件是Notebook但因為受限Product的型態
//		nb.getWarranty(); 這就可以
		
		Notebook item3 = (Notebook)item;//把product轉成Notebook 要強制
	//	if (item instanceof Food) {
		//	Food item4 =(Food)item;//ClassCastException
			
	//	}
		
		//Product p = new product("AAA",1000);抽象類別不能ＮＥＷ
	    //p.calcTotal;///?????
		
		
		//111.03.05日曆,從日曆才能轉成java.util.Date
		//GregorianCalendar calendar = new GregorianCalendar(2022, Calendar.MARCH, 15);
		//Date expDate = calendar.getTime() ;//要用util
		Date exDate = Product.getDate(2022, 3, 15);
		Food food = new Food("肉圓", 50, exDate);
		System.out.println(food.desc());
		
		
		SimCard simCard = new SimCard("日本漫遊" , 700 , 7, Product.getDate(2022, 3, 31));
		System.out.println(simCard.desc());
		Product[] products = { nb , food ,simCard};//product陣列
		
		//buy(nb);
		//buy(food);
		buy(products);
	}

	public static void buy(Product[] ps) {
		int sum = 0;
		for (Product product : ps) {
			//處理過期的商品(implement Expirable),檢查是否已經過期
			if (product instanceof Expirable) {
				Expirable item = (Expirable) product;
				Date now = new Date();
				if (item.最後期限().before(now)) {
					System.out.println(product.getName()+"已過期!!");
					continue;
				}
			}
			System.out.println("買入"+product.desc());
			sum += product.getPrice();
		}
		System.out.println("總金額:"+ sum);
	}
	
	}
	

