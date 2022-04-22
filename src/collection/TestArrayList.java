package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestArrayList {

	public static void main(String[] args) {

		List<String>list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
	//	Double d = new Double(3.0);
		//list.add(3.0);
		
	//	String value = "3";
     //System.out.println(Integer.parseInt(value)+1);
		
		System.out.printf("list大小:%d%n",list.size());
		System.out.printf("第一個是:%s%n",list.get(0));
		System.out.printf("第二個是:%s%n",list.get(1));
		
		for (int i = 0; i < list.size(); i++) {
			String item = list.get(i);
			System.out.println(item);
		}
		//Iterator
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
		System.out.println("------------------");
		//foreach
		for (String item: list) {
		System.out.println(item);
	}
		System.out.println("---consumer----");
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		System.out.println("----------lambda-----");
		list.forEach((String t)->{
			System.out.println(t);
		});
		list.forEach( (t) -> System.out.println(t));
		//method reference
		list.forEach(TestArrayList::printItemArray);
	}
	public static void printItemArray(String item) {
		System.out.println("Method reference:"+item);
	}
}
