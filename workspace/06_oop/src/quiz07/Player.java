package quiz07;

import java.util.Scanner;

public class Player {

	// field
	private String name;
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	public Player(String name) {
		this.name = name;
	}

	// method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int play() {
		System.out.println(name + "'s game start!");
		System.out.println("Press Enter!");
		// Enter입력 : nextLine()
		sc.nextLine();
		long start = System.currentTimeMillis();  // 첫 엔터 시간
		System.out.println("After 10seconds Press Enter!");
		sc.nextLine();
		long end = System.currentTimeMillis();  // 두 번째 엔터 시간
		// 경과시간반환
		return (int)((end - start) / 1000);
	}
	
}
