package main;

import java.util.Scanner;

import dao.StaffDao;
import dto.StaffDto;

public class StaffManager {

	// field
	private StaffDao dao = StaffDao.getInstance();
	private Scanner sc = new Scanner(System.in);
	private int no;
	
	// method
	public void insertStaff() {
		no++;
		System.out.print("사원 이름 >>> ");
		String name = sc.next();
		System.out.print("부서 이름 >>> ");
		String department = sc.next();
		StaffDto staffDto = new StaffDto();
		staffDto.setNo(no);
		staffDto.setName(name);
		staffDto.setDepartment(department);
		int result = dao.insertStaff(staffDto);  // DB에 삽입
		System.out.println(result + "명의 사원이 추가되었습니다.");
	}
	
}






