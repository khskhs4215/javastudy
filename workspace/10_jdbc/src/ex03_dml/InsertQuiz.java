package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertQuiz {

	public static void main(String[] args) {
		
		// 임의의 3명의 staff을 삽입하세요.
		// 반복문과 배열을 사용하세요.
		int[] noList = { 3, 4, 5 };
		String[] nameList = { "david", "james", "jack" };
		String[] departList = { "총무", "영업", "고객" };
		String[] hireDateList = { "SYSDATE", "21/03/15", "21/03/20" };
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) { ps.close(); }
				if (con != null) { con.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
