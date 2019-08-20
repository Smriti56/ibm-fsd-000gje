package Thread;

public class MyThreadDemo implements Runnable{
	
	public static void main(String[] args) {
		
		MyThreadDemo mythread=new MyThreadDemo();
		MyThreadDemo2 thread=new MyThreadDemo2();
		
		Thread t1=new Thread(mythread);
		Thread t2=new Thread(thread);
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(t2.isAlive());
		
	}

	@Override
	public void run() {
		for(int i=0;i<20;i++)
		{
			System.out.println("i=> " +i);
			if(i==10)
			{
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}

				
			}
		}
		
	}
	
}
