import category.Item;  
//KEY Item 時會自動 import 也可手動 Ctrl + 1  或移動到錯誤地方系統會給建議
//import category.Item;

public class TestPackage {

	public static void main(String[] args) {
		
		
		Item a =new Item();
		a.name = "Notebook";
		System.out.println(a.name);
		
	}

}
