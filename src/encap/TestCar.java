package encap;

public class TestCar {

	public static void main(String[] args) {
		
		Car c =new Car("白色");
		//c.model = "Yaris";
		//c.SetModel("Yaris");
		//c.price = 575000;
		
		System.out.printf("型號:%s,價錢:%d,顏色:%s%n",c.getModel(),c.getPrice(),c.getColor());

	}

}
