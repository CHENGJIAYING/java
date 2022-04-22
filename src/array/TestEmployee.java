package array;



public class TestEmployee {

	public static void main(String[] args) {
	
		
		Employee[] emps = new Employee[3];
		
		//Employee emp1 = new Employee();
		//emp1.empno = 1;
		//emp1.name = "Vincent";
		//emps[0] = emp1; //把員工放到陣列中的第一個
		
		//上下2種方法一樣 P72. P73
		
		emps[0] = new Employee();
		emps[0].name ="Vincent";
		emps[0].empno =1;
		
		emps[1] = new Employee();
		emps[1].name ="Summer";
		emps[1].empno =2;
		
		emps[2] = new Employee();
		emps[2].name ="Jack";
		emps[2].empno =3;
		
		System.out.println(emps[0].name + "," + emps[0].empno);
		System.out.println(emps[1].name + "," + emps[1].empno);
		for (int i = 0; i < emps.length; i++) {
			System.out.printf("員工編號:%d,姓名:%s%n",emps[i].empno,emps[i].name);
		}
		
		
		
		
		
		

	}

}
