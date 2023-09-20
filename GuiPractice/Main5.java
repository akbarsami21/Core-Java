package practice;

class MyGeneric<T1>{
	int value;
	T1 t1;
	MyGeneric(int value,T1 t1){
		this.value=value;
		this.t1=t1;
	}
	void T1Return() {
		System.out.println(t1);
		
	}
	void ValueReturn() {
		System.out.println(value);
		
	}
}
public class Main5 {
	public static void main(String[] args) {
		MyGeneric<String> ob=new MyGeneric(10,"lili");
		ob.T1Return();
		ob.ValueReturn();
	}

}
