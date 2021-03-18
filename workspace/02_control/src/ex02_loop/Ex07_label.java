package ex02_loop;

public class Ex07_label {

	public static void main(String[] args) {
		
		// label
		// 1. 소스코드의 특정 위치를 지정하는 방법입니다.
		// 2. 방법
		//    label:  소스코드
		
		// dan x n = (dan * n)
		
		outer: for (int dan = 2; dan <= 9; dan++) {
			inner: for (int n = 1; n <= 9; n++) {
				System.out.println(dan + "x" + n + "=" + (dan * n));
				if (dan == 5 && n == 5) {
					// break inner;
					break outer;
				}
			}
		}
		
		/* label이 없을 때
		for (int dan = 2; dan <= 9; dan++) {
			int n;
			for (n = 1; n <= 9; n++) {
				System.out.println(dan + "x" + n + "=" + (dan * n));
				if (dan == 5 && n == 5) {
					break;
				}
			}
			if (dan == 5 && n == 5) {
				break;
			}
		}
		*/

	}

}
