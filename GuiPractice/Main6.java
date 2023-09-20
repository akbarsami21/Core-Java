package practice;

class Generic<T1, T2> {
	T1 t1;
	T2 t2;

	void addFirst(T1 value) {
		this.t1 = value;
	}

	T1 getFirst() {
		return t1;
	}

	void addSecond(T2 str) {
		this.t2 = str;
	}

	T2 getSecond() {
		return t2;
	}
}

public class Main6 {
	public static void main(String[] args) {
		Generic<Integer, String> gen = new Generic();
		gen.addFirst(10);
		gen.addSecond("lili");
		System.out.println(gen.getFirst());
		System.out.println(gen.getSecond());
	}

}
