package Thread;

public class MyThreadDemo2 implements Runnable {
	
	public void run()
	{
		for(int j=0;j<=20;j++)
		{
			if(j==10)
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("j=> "+j);
		}
	}

}
