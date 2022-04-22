package thread;

public class TestThread {
	public static void main(String[] args) {
		
		
		//MyThread t1 = new MyThread();
		
		Runnable r = () -> {
			for(int i =5; i > 0 ; i--) {
				//	Thread.currentThread()取得目前執行此行程式的執行緒(Thread)
					
				System.out.println("倒數:"+i+"秒,"+Thread.currentThread());
				try {
					Thread.sleep(1000);//停1秒
			}catch (InterruptedException e) {
						e.printStackTrace();
		
		
		
		
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
				for(int i =5; i > 0 ; i--) {
					//	Thread.currentThread()取得目前執行此行程式的執行緒(Thread)
						System.out.println("倒數:"+i+"秒,"+Thread.currentThread());
						Thread.sleep(1000);//停1秒
						} 
				}catch (InterruptedException e) {
							e.printStackTrace();
						}
						
					}
						
					//System.out.println(Thread.currentThread()+"執行完畢");
					
			
		});
		//Thread t1 = new Thread(r);
		t1.setName ("倒數執行緒") ;
		t1.start();//呼叫Start會執行run(),甚麼時候真的執行不一定,視作頁系統決定,非同步
		System.out.println("done");
		
		}
	}

		};
	}
}
	
	
	
	
	
	

