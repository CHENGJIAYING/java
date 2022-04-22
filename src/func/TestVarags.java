package func;

public class TestVarags {

	public static void main(String... args) {
		
		add(1);
		add(1,2);
		add(1,2,3);
	}
		
		
	public static int add(int... a) {
		int sum = 0;
		for (int i :a) {
			sum +=i;
			}
		return sum;
	}
	
}
