package example;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Model model = new Line(0,20);
		Model model1 = new Line(0,10);
		System.out.println(model.greaterThan(model,model1));
		System.out.println(model1.lesserThan(model, model1));
		
		System.out.println(model.moreThan(model1));
		
		

	}

}