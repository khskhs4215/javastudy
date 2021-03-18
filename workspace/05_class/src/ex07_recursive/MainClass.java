package ex07_recursive;

public class MainClass {

	public static void main(String[] args) {
		
		SayHello sh = new SayHello();
		sh.say(5);
		
		Adder adder = new Adder();
		adder.calculate(10);  // 1부터 10까지 합계를 구해서 보여줍니다.
		System.out.println(adder.getTotal());
		
		Calculator calc = new Calculator();
		int n = 5;
		System.out.println(n + "! = " + calc.getFactorial(n));
		
	}

}