package exception;

public class TestException {

	public static void main(String[] args) {
		try{
		int a = 1;
		int c = 1;
		System.out.println("c="+ c);
		int b = a / c;
		System.out.println("b="+b);
		int [] x = {};
		System.out.println(x[0]);
		
		}catch (ArithmeticException |ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			//System.out.println("發生錯誤,除上0了");
	     //catch (ArrayIndexOutOfBoundsException ex) {
	    	//ex.printStackTrace();
	    	//System.out.println("發生錯誤,除上0了");}
	    } catch (Exception ex) {
			 ex.printStackTrace();
		}
		
		finally {
			System.out.println("一定會被執行的!");
		}
		
		System.out.println("有錯誤被攔住 以外的程式還會被執行");
		System.err.println("ERR可以列出紅字");
	}

}
