package ex02_loop;

import java.util.Scanner;

// 1. 퀴즈 맞히기
// 맞힐때까지 계속 물어보는 퀴즈입니다.
// 대한민국의 수도는? >>> 서울 또는 seoul
// 정답입니다.
// 대한민국의 수도는? >>> 인천
// 오답입니다.

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// String city = "";
		String city = null;
		
		do {
			if (city != null) {
				System.out.println("오답입니다.");
			}
			System.out.print("대한민국의 수도는? >>> ");
			city = sc.next();
		} while ( !city.equals("서울") && !city.equalsIgnoreCase("seoul") );  // 틀리면 계속 물어봅니다.

		System.out.println("정답입니다.");
		
		sc.close();
		
	}

}
