package interFace;
//型態:superman, Lawyar, Accountant
public class Superman implements Lawyer,Accountant {

	public void 訴訟() {
		
	}
	
	@Override
	public void tax() {
		
	}
	
	public static void main(String[] args) {
		
		Superman s = new Superman();
		s.訴訟();
		s.tax();
	}

	
}
