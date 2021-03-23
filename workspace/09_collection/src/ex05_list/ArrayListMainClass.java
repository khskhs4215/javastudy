package ex05_list;

import java.util.ArrayList;
import java.util.List;

/*
	ArrayList 클래스
	1. List 인터페이스를 구현한 클래스입니다.
	2. 생성방법
	   1) ArrayList<E> list = new ArrayList<E>();
	   2) List<E> list = new ArrayList<E>();
	3. 배열을 구현한 클래스입니다. 자동으로 길이를 조정합니다.
	4. 장점: 순차적인 접근이 빠르다.
	5. 단점: 중간 위치에 추가/삭제가 느리다.
*/

public class ArrayListMainClass {

	public static void main(String[] args) {
		
		// 1. 생성
		List<String> list = new ArrayList<String>();

		// 2. 추가
		list.add("브레드");
		list.add("짱구");
		list.add("자두");
		list.add("둘리");
		list.add("띠띠뽀");
		
		// 3. 삭제
		list.remove(0);
		list.remove("짱구");
		
		// 4. 크기
		System.out.println("리스트의 길이: " + list.size());
		
		// 5. 포함 여부 확인
		if (list.contains("둘리")) {
			System.out.println("둘리가 있습니다.");
		} else {
			System.out.println("둘리가 없습니다.");
		}
		
		// 6. 요소 가져오기
		System.out.println("첫 번째 요소: " + list.get(0));
		System.out.println("마지막 요소: " + list.get(list.size() - 1));
		
		// 7. 전체 순회
		// 1) 일반 for문
		int length = list.size();  // size() 메소드 호출을 1번만 진행하도록 변수에 저장해 둡니다.
		for (int i = 0; i < length; i++) {
			System.out.println((i + 1) + "번째 요소: " + list.get(i));
		}
		// for (int i = 0, length = list.size(); i < length; i++) {
		
		// 2) 향상 for문
		for (String element : list) {
			System.out.println(element);
		}
		
		// 8. 출력
		System.out.println("한 번에 출력: " + list);
		
		// 9. 초기화
		list.clear();
		System.out.println("한 번에 출력: " + list);
		
	}

}
