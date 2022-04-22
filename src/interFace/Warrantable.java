package interFace;

public interface Warrantable {
	//系統常數,全大寫,中間是底線區隔兩個字,在介面中,puiblic, static ,final皆可省略
	public static final int MAX_WARRANTY =365;
	 int 保固天數();

	 default int 檢測費用(){
		 return 500;
	 }
	 
}
