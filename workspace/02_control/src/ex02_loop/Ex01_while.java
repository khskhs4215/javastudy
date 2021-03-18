package ex02_loop;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		
		// 무한루프 만들기
		/*
		while (true) {
			System.out.println("무한루프입니다.");
		}
		*/
		
		// 1 ~ 10 출력
		/*
		int n = 1;
		while (n <= 10) {  // n: 1~10인 경우 while (true) { 
			System.out.println(n++);
		}
		*/

		// 10 ~ 1 출력
		/*
		int n = 10;
		while (n >= 1) {
			System.out.println(n--);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		// 'A' ~ 'Z' 사이를 계속 입력 받는 프로그램
		// 대문자가 입력되지 않으면 종료합니다.
		/*
		char ch = 'A';
		
		while (ch >= 'A' && ch <= 'Z') {  // while (ch >= 65 && ch <= 90) { 
			System.out.print("대문자 입력 >>> ");
			ch = sc.next().charAt(0);
		}
		*/
		
		// 입력 받은 정수를 모두 더해줍니다.
		// 0 이상은 모두 더해주고, 음수가 입력되면 그만합니다.
		// 합계를 출력해 봅시다.
		
		int total = 0;
		int n = 0;  // 최초 while문 진입 용도
		
		while (n >= 0) {
			System.out.print("양수 입력 >>> ");
			n = sc.nextInt();
			total += n;
		}
		
		total -= n;  // n이 음수일 때 처리되므로, -= 로 처리합니다.
		System.out.println("합계는 " + total + "입니다.");
		
		sc.close();
		
	}

}
