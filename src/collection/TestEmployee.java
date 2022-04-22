package collection;

import java.util.HashSet;
import java.util.Set;

public class TestEmployee {

	public static void main(String[] args) {

		Set set = new HashSet();
		Employee e1 = new Employee("001");
		Employee e2 = new Employee("001");//會被EQUALS跟hashcode影響
	
		set.add(e1);
		set.add(e2);
		System.out.printf("Set大小:%d%n",set.size());
		
		
		
		
	}

}
