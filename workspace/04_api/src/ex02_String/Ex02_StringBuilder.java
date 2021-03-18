package ex02_String;

// String의 +연산자를 많이 사용하면 성능이 떨어집니다.

public class Ex02_StringBuilder {

	public static void main(String[] args) {
		
		// java.lang.StringBuilder
		
		// 문자열 생성
		StringBuilder sb = new StringBuilder("hello");
		
		// 문자열 추가 (핵심 메소드)
		sb.append(" ").append("java");
		
		System.out.println(sb);
		
		
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		
		// 문자열 비교
		System.out.println(sb1.equals(sb2));  // String이 아니라서 비교 못합니다.
		
		// 문자열로 변환해 봅시다.
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		System.out.println(str1.equals(str2));  // 이제 비교가 됩니다.

	}

}
