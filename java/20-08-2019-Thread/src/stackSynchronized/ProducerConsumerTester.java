package stackSynchronized;

public class ProducerConsumerTester {
	private final static MyStack mystack= new MyStack();

	
	public static void main(String[] args) {
		
		StackProducer prod= new StackProducer(mystack);
		StackConsumer cons = new StackConsumer(mystack);
		
		
		Thread producer = new Thread(prod);
		Thread consumer = new Thread(cons);
		
		producer.start();
		consumer.start();
		
		
		
	}
}
