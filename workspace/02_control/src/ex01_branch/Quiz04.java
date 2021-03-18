package ex01_branch;

import java.util.Scanner;

/*
	4. switch, 단계를 숫자로 입력 받아 구분 출력
	   1 입력 : 기승전결
	   2 입력 : 승전결
	   3 입력 : 전결
	   4 입력 : 결
	   나머지 : 알 수 없음
*/

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단계(1~4) 입력 >>> ");
		int step = sc.nextInt();
		
		switch (step) {
		case 1: System.out.print("기");
		case 2: System.out.print("승");
		case 3: System.out.print("전");
		case 4: System.out.print("결");
		        break;
		default: System.out.println("알 수 없음");
		}
		
		sc.close();

	}

}
