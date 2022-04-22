package extend;
//Notebook, Product
public class Notebook extends Product {

	//public String name;
	//public int price;
	public int warranty;
	
	public Notebook(String name, int price, int warranty) {
		//this.name = name;
		//setName(name);
		//this.price = price;
		//setPrice(price);
		super(name, price);
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	//override
	@Override
	public String desc() {
		String info = super.desc();//打SUPER後 alt + shift + L
		return String.format("%s,保固天數:%d天",info,this.warranty);
		
		//return String.format("商品名稱:%s,價錢:NT$%d元,保固天數:%d天", this.name, this.price, this.warranty);
	}
	
	
	
    
	
	
	
}
