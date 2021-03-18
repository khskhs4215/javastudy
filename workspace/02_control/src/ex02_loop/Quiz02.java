package ex02_loop;

import java.util.Scanner;

// 2. 영화 평점을 입력받아서 ★을 출력
// 평점은 1~5 사이의 정수이고, 잘못된 평점은 다시 입력 받습니다.

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int grade = 0;  // 평점
		do {
			System.out.print("평점 입력 >>> ");
			grade = sc.nextInt();
		} while (grade < 1 || grade > 5);
		
		String stars = "";  // 빈 문자열("")은 문자열 연결 연산(+)의 경우에 초기화로 사용됩니다.
		for (int n = 0; n < grade; n++) {  // grade만큼 반복됩니다.
			stars += "★";
		}
		
		System.out.println("평점: " + grade + "(" + stars + ")");
		
		sc.close();
		
	}

}
