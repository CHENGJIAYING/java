package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
	//	DescComparator descComparator = new DescComparator();
		Comparator comparator = (Object o1, Object o2) -> {
				//指定排序規則
				Integer i1 =(Integer) o1;
				Integer i2 =(Integer) o2;
				if (i1 > i2) {
					return -1;
					
				}else if (i1 < i2) {
					return 1;
				}else
				return 0;
		};
		
		
		Set set = new TreeSet();
		set.add(4);
		set.add(3);
		set.add(2);
		set.add(1);
		
		for (Object i : set) {
			System.out.println(i);
		}
	}

}
