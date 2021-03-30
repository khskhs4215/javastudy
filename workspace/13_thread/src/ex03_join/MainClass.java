package ex03_join;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator calc1 = new Calculator();
		Calculator calc2 = new Calculator();
		calc1.addition(1, 500);
		calc2.addition(501, 1000);
		System.out.println(calc1.getResult() + calc2.getResult());
		
	}

}
