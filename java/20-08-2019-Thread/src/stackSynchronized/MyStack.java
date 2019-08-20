package stackSynchronized;

public class MyStack{

	
	private int index=-1;
	private static final int MAX=26;
	private char[] info=new char[MAX];
	
	public synchronized void push(char item) throws InterruptedException
	{
		if(index==MAX)
		{
			System.out.println("Stack is full");
			System.out.println("Producer is waiting");
			wait();
		}
		info[++index]=item;
		System.out.println(item+" is pushed and consumer notified");
		notify();
	}
	public synchronized char pop() throws InterruptedException
	{
		if(index==-1)
		{
			System.out.println("Stack is empty");
			System.out.println("Producer is waiting");
			wait();
			
		}
		System.out.println(info[index--]+ " is popped producer notified");
		notifyAll();
		return info[index--];
	}
	
	

}


