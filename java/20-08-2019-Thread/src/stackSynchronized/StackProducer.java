package stackSynchronized;

public class StackProducer implements Runnable {

	private MyStack myStack;
	
	
	public StackProducer(MyStack myStack) {
		super();
		this.myStack = myStack;
	}


	public void run() {
		for (int i=0;i<26;i++)
		{
			
			try {
				myStack.push((char) ((char)i+64+1));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
