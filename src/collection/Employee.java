package collection;

import java.util.Objects;

public class Employee {

	private String id;
	public Employee(String id) {
		this.id = id;
	}
	/*工具也可產生 右鍵 SOURCE GET...HASH..EQUAL
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}
	*/
	
	
	
	@Override
	public boolean equals(Object obj) {
		//this == e1, obj == e2
		//先判斷傳進來的物件是不是employee
		if (obj instanceof Employee) {
			Employee emp = (Employee) obj;
			return this.id.equals(emp.id);
			
		}
		return false;
	}
	public String getId() {
		return id;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
		
	}
	
	protected void finalize() throws Throwable{
		System.out.println("Employee("+this.id+")GC!!");
		//釋放HOLD住資源,關閉檔案,關閉資料庫連線
	}
	
	public String tosString() {
		return String.format("員工(%s)",this.id);
	}
	
}
