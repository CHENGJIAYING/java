package exam.e9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortList  {
    public static void main(String[] args) {
        Employee e1 = new Employee("001",10000,300);
        Employee e2 = new Employee("002",10000,200);
        Employee e3 = new Employee("003",20000,200);
        Employee e4 = new Employee("004",30000,200);

        List<Employee> list = Arrays.asList(e1, e2, e3, e4);
        //請利用List中的sort方法重新排序e1..e4，排序時薪水(salary)大的排前面，如果薪水一樣則commission小的排前面
     
        Set set = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Employee emp1 = (Employee) o1;
				Employee emp2 = (Employee) o2;
				int emp1salary = (Integer)(emp1.getSalary());
				int emp2salary = (Integer)(emp2.getSalary());
				int emp1com = emp1.getCommission();
				int emp2com = emp2.getCommission();
				System.out.printf("o1=%d,o2=%d%n",emp1salary,emp2salary);
				if (emp1salary>emp2salary) {
						return -1;
				}else if (emp1salary<emp2salary) {
						return 1;
					}else {
				return 0;
					}
			}
		});
        	set.add(e2)	;
        	set.add(e3)	;
        	set.add(e1)	;
        	set.add(e4)	;
        	System.out.println(set.size());
        	for (Object emp : set) {
				System.out.println(emp);
			}
        		
    
        		
        		
    //    System.out.println(list);

    }
}
	

