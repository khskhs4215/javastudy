package ex01_random;

// 1. 임시비밀번호 발급하기
// 영문대문자 + 아라비아숫자 6자리
// 약 5:5

public class Quiz01 {

	public static void main(String[] args) {
		
		// 방법1.
		char[] charSet = {
				'0', '1', '2', '3', '4', '5',
				'6', '7', '8', '9', 'A', 'B',
				'C', 'D', 'E', 'F', 'G', 'H',
				'I', 'J', 'K', 'L', 'M', 'N',
				'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z'
		};
		
		// 인덱스를 랜덤하게 생성합니다.   0 <= random < charSet.length
		
		String tempPw = "";
		for (int n = 0; n < 6; n++) {  // 6번 반복을 의미합니다.
			int idx = (int)(Math.random() * charSet.length) + 0;
			tempPw += charSet[idx];
		}
		System.out.println(tempPw);
		
		// 방법2.
		// 문자 == 정수
		// '0' ~ '9' == 48 ~ 57
		// 'A' ~ 'Z' == 65 ~ 90
		// 'a' ~ 'z' == 97 ~ 122
		
		String tempPw2 = "";
		for (int n = 0; n < 6; n++) {  // 6번 반복을 의미합니다.
			if (Math.random() < 0.5) {
				int arabia = (int)(Math.random() * 10) + '0';
				tempPw2 += (char)arabia;
			} else {
				int alphabet = (int)(Math.random() * 26) + 'A';
				tempPw2 += (char)alphabet;
			}
		}
		System.out.println(tempPw2);

	}

}
