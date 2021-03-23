package ex09_hash;

/*
	몇몇 아이디가 있습니다.

	각각의 해시코드를 몇몇 규칙으로 생성해 봅니다.
	1) 첫 글자에 따라서 해시코드를 정한다.
	          해시코드
	'apple'   1
	'africa'  1
	'avatar'  1
	'banana'  2
	'bonus'   2
	'bravo'   2
	
	2) 글자수에 따라서 해시코드를 정한다.
		      해시코드
	'apple'   5
	'africa'  6
	'avatar'  6
	'banana'  6
	'bonus'   5
	'bravo'   5
	
	입력된 아이디를 검색하고자 합니다.
	검색 속도를 높이기 위해서 'hash' 개념이 사용됩니다.
	
	검색 예시)
	검색 아이디: 'april'
	사용 해시코드: 글자수
	동작
	1) 'april'의 해시코드를 구한다.
	   ('april'의 해시코드는 5)
	2) 해시코드가 5인 'apple', 'bonus', 'bravo' 중에서 'april'을 찾는다.
	
*/

public class HashCodeMainClass {

	public static void main(String[] args) {
		
	}
	
}
