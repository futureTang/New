package operators;

class Value {
	int i;
}

public class EqualsMethod {
	public static void main(String[] args) {
		Value v1 = new Value();
		Value v2 = new Value();
		//v1 = v2;
		v1.i = v2.i = 100;
		System.out.println(v1.equals(v2)); // equals 默认比较引用
	}
}
