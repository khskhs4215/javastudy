package ex03_api;

// 1. String과 StringBuilder의 성능 비교
// 1) 1 ~ 100000을 모두 연결합니다.(12345678910111213....)
// 2) 각 클래스별로 연결에 소요된 시간을 ns(나노초)단위로 출력합니다.

public class Quiz01 {

	public static void main(String[] args) {
		
		// 1. String
		String str = "";
		long start1 = System.nanoTime();
		for (int n = 1; n <= 100000; n++) {
			str += n;
		}
		long end1 = System.nanoTime();
		System.out.println("String 경과시간: " + (end1 - start1) + "ns");
		System.out.println("String 경과시간: " + ((end1 - start1) / 1000000000.0) + "초");

		// 2. StringBuilder
		StringBuilder sb = new StringBuilder();
		long start2 = System.nanoTime();
		for (int n = 1; n <= 100000; n++) {
			sb.append(n);
		}
		long end2 = System.nanoTime();
		System.out.println("StringBuilder 경과시간: " + (end2 - start2) + "ns");
		System.out.println("StringBuilder 경과시간: " + ((end2 - start2) / 1000000000.0) + "초");
		
	}

}
