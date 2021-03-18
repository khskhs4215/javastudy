package ex02_String;

public class Ex01_String {

	public static void main(String[] args) {
		
		// 1. 동일한 문자열 리터럴은 자바에 의해서 최적화 되기 때문에
		//    "apple"이 하나만 생깁니다.
		String a = "apple";
		String b = "apple";
		System.out.println(a == b);  // 참조비교(주소비교)
		
		// 2. new는 무조건 새로 만듭니다.
		//    "banana"는 2개가 있습니다.
		String c = new String("banana");
		String d = new String("banana");
		System.out.println(c == d);  // 참조비교(주소비교)
		
		// 3. 문자열의 길이는 length() 메소드로 구합니다.
		System.out.println(a.length());  // 5
		
		// 4. 문자열의 일부를 추출하는 경우에는 substring() 메소드를 사용합니다.
		// 1) substring(시작인덱스): 시작인덱스부터 끝까지 추출합니다.
		// 2) substring(시작인덱스, 종료인덱스): 시작인덱스 <= 추출한문자열 < 종료인덱스
		System.out.println(a.substring(0, 3));  // app (사용인덱스 : 0, 1, 2)
		
		// 5. 문자열 양 옆의 공백문자(white space)를 제거하려면 trim() 메소드를 사용합니다.
		String name = "     alice    ";
		System.out.println(name.trim().length());  // 양 옆의 공백을 모두 제거하고 alice만 남깁니다.
		
		// 6. 특정 문자를 찾는 경우에 indexOf() 메소드를 사용합니다.
		//    찾고자 하는 문자(문자열)의 인덱스를 반환합니다.
		String str = "best of best of best";
		System.out.println("첫 번째 best의 인덱스: " + str.indexOf("best"));  // 처음부터 best를 검색합니다.
		System.out.println("두 번째 best의 인덱스: " + str.indexOf("best", 4));  // 인덱스4부터 best를 검색합니다.
		System.out.println("두 번째 best의 인덱스: " + str.indexOf("best", str.indexOf("best") + 1));
		System.out.println("찾는 문자(열)이 없으면 " + str.indexOf("v") + "이 나타납니다.");  // 없으면 -1입니다.
		
		// 7. 뒤에서부터 검색하는 lastIndexOf() 메소드가 있습니다.
		System.out.println("마지막 best의 인덱스: " + str.lastIndexOf("best"));
		
		// 8. 기존 문자를 새로운 문자로 변경하는 replace() 메소드가 있습니다.
		System.out.println(str.replace("b", "B"));
		System.out.println(str.replace("f", ""));  // "f"를 지웁니다.
		
	}

}
