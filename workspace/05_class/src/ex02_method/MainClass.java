package ex02_method;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.set("alice", 30, '여', false, 170.5, 70.5);  // 인수가 6개
		
		p.info();  // 인수가 0개

		double bmi = p.getBMI();
		System.out.println(bmi);
		
	}

}
