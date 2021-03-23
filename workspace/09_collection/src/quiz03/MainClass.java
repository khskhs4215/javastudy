package quiz03;

import java.util.HashSet;
import java.util.Set;

// 로또 번호 6개를 HashSet에 저장하기

public class MainClass {

	public static void main(String[] args) {
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		while (lotto.size() != 6) {
			lotto.add((int)(Math.random() * 45) + 1);
		}
		
		System.out.println(lotto);
		
	}
	
}
