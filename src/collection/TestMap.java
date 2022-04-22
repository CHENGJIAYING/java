package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();//沒有順序,LinkedHaskMap就可以排序
		map.put("John", 2000);
		map.put("David", 1000);
		map.put("Tom", 5000);
		map.put("Tom", 2500);
		
		System.out.printf("Tom's 薪水 = %d%n",map.get("Tom"));
		
		//取出所有的KEY
		 Set<String> keySet = map.keySet();//shift + alt + l
		for (Object key : keySet) {
			System.out.printf("%s的薪水=%d%n",key,map.get(key));
		}
		System.out.println("------entry set-----");
		
		  Set<Entry<String, Integer>> entrySet = map.entrySet();
		int sum = 0 ;
		for (Entry<String, Integer> entry: entrySet) {
			//Map.Entry entry =(Map.Entry) item;
			System.out.printf("%s的薪水=%d%n",entry.getKey(),entry.getValue());
			sum += (Integer)entry.getValue();
		}
		System.out.println("總和="+ sum);
		System.out.println("-----foreach------");
		map.forEach(new BiConsumer<String, Integer>() {

			@Override
			public void accept(String key, Integer value) {
				System.out.printf("%s的薪水=%d%n",key,value);
			}
		});
		map.forEach((key,value) -> {
			System.out.printf("%s的薪水=%d%n",key,value);
		});
		map.forEach( (key,value) -> System.out.printf("%s的薪水=%d%n",key,value));
		
		}
	}


