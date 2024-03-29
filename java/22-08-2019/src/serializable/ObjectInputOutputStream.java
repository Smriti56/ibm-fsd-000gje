package serializable;

import java.io.*;

public class ObjectInputOutputStream {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Employee employee = new Employee("10","Sachin",20000,"mumbai");
	System.out.println("Employee to write is :"+employee);
	
	FileOutputStream out = new FileOutputStream("employee.out");
	ObjectOutputStream oos= new ObjectOutputStream(out);
	oos.writeObject(employee);
	oos.flush();
	
	
	FileInputStream in = new FileInputStream("employee.out");
	ObjectInputStream ois=new ObjectInputStream(in);
	employee=(Employee)(ois.readObject());
	
	System.out.println("Employee read is: "+employee);
	
	
}
}
