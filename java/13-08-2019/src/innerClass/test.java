package innerClass;

import innerClass.OuterClass.InnerClass;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc= new OuterClass();
		oc.outerMethod();
		OuterClass.InnerClass  ic= oc.new InnerClass();
		ic.innerMethod();
		//ic.outerMethod();
		
		OuterClass.InnerClass.Inner2 ic2 = oc.new InnerClass().new Inner2();
		ic2.innerMethod2();
		
		
		
	}

}
