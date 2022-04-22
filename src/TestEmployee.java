
public class TestEmployee {

	public static void main(String[] args) {
		int a = 1;
		Employee emp =new Employee();//NEW=等於把房子蓋起來0800
		emp.empno = 1;//.的屬性會有預設值,0
		emp.name = "Vincent";
		
		System.out.println("編號="+emp.empno+",姓名="+emp.name);
		
		//ctrl+alt+down =copy
		//alr+down=move
		Employee emp2 =new Employee();//NEW=等於把房子蓋起來0900
		emp2.empno = 2;//.的屬性會有預設值,0
		emp2.name = "Marry";
		
		System.out.println("編號="+emp2.empno+",姓名="+emp2.name);
		System.out.println(a==1); //true
		System.out.println(emp == emp2);//false   是比較記憶體位置
		
		a= 2;
		emp2 = emp;// emp2 =0800
		System.out.println("編號="+emp2.empno+",姓名="+emp2.name);
		System.out.println(emp == emp2);//true   是比較記憶體位置
		
		//a = null; 會有錯誤
		//emp = null;//null只能用在物件變數
		//emp2 = null;
			
		//System.out.println("編號="+emp2.empno+",姓名="+emp2.name);
	if (emp2!= null) {
		System.out.println("編號="+emp2.empno+",姓名="+emp2.name);
				
	}
	}

}
