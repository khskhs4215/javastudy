package quiz02;

import java.util.ArrayList;
import java.util.List;

// 1 ~ 10000 사이의 값을 가지고 있는 ArrayList를 2개 만들고,
// 모든 요소를 하나씩 삭제합니다.
// 1. 가장 성능이 나쁜 방법
// 2. 가장 성능이 좋은 방법

public class MainClass {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for (int i = 0; i < 10000; i++) {
			list1.add(i + 1);
			list2.add(i + 1);
		}
		
		// 1. 나쁜 성능
		long start1 = System.nanoTime();
		for (int i = 0, length = list1.size(); i < length; i++) {
			list1.remove(0);
		}
		long end1 = System.nanoTime();

		// 2. 좋은 성능
		long start2 = System.nanoTime();
		for (int i = list2.size() - 1; i > -1; i--) {
			list2.remove(i);
		}
		long end2 = System.nanoTime();
		
		System.out.println("나쁜 성능: " + (end1 - start1) + "ns");
		System.out.println("좋은 성능: " + (end2 - start2) + "ns");
		
	}

}
