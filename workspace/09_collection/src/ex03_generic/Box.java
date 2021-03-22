package ex03_generic;

public class Box<T> {

	// field
	private T[] items;
	private int idx;
	
	// constructor
	public Box(int itemCount) {
		// items = new T[itemCount];  코드 작성 시점에는 T의 구체적인 종류를 알 수 없어서, 메모리 할당이 불가능합니다.
		items = (T[])(new Object[itemCount]);  // Object 배열 생성 뒤에는 캐스팅을 해 줘야 합니다.
	}
	
	// method
	public void addItem(T item) {
		if (idx == items.length) {
			System.out.println("Full");
			return;
		}
		items[idx++] = item;
	}
	@Override
	public String toString() {
		String result = "";
		for (T item : items) {
			if (item != null) {
				result += item.toString();  // item.toString() -> Fruit의 toString()
			}
		}
		return result;
	}
	
}
