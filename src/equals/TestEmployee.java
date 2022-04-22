package equals;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee("001");
		Employee e2 = new Employee("001");
		
		System.out.println(e1);
		System.out.println(e1.toString());
		
		
		
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
		System.out.println("e1's hash="+e1.hashCode());
		System.out.println("e2's hash="+e2.hashCode());
		
		//GC較少再用
		e1 = null;
		System.gc();//強制建議系統執行GC
		
		
		
	}

}
