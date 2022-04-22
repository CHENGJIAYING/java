package innerClass;

import interFace.Lawyer;

public class TestInnerClass {

	public static void main(String[] args) {
		
		
		OuterClass oClass = new OuterClass(1.8, 70);
		oClass.printBMI();
		
		//Annoymous class
		Lawyer lawyer = new Lawyer() {
			
			@Override
			public void 訴訟() {
				System.out.println("訴訟");
			}
		};
		lawyer.訴訟();
	}

	
	
}
