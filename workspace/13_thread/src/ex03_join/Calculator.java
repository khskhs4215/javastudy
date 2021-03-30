package ex03_join;

public class Calculator {

	// field
	private int result;
	
	// method
	public void addition(int from, int to) {
		// from부터 to까지 모든 정수 더해서 result에 저장
		if (from > to) {
			int temp = from;
			from = to;
			to = temp;
		} 
		for (int n = from; n <= to; n++) {
			result += n;
		}
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
}
