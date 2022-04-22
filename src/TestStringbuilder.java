
public class TestStringbuilder {

	public static void main(String[] args) {
	
		
		String temp ="";
		for (int i = 0; i < 10 ; i++) {
				temp = temp +i;
			//i=0 , temp = "" + 0 = "0"
			//i=1 , temp = "0" + 1 = "01"
			//i=2 , temp = "01" + 2 = "012"
			
				
				
		}

		System.out.println(temp);
		
		//StringBuider
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10 ; i++) {
			sb.append(i);
	}
		System.out.println(sb.toString());
		
		
	}

}
