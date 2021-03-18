package ex07_recursive;

public class Adder {
	
	private int total;  // 0입니다.
	
	public void calculate(int n) {
		if (n == 0) {
			return;  // 결과타입이 void인 경우에만 return;을 통해서 메소드를 종료합니다.
		}
		total += n;
		calculate(n - 1);
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
