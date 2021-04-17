package sec03.exam04_outterclass_ref;

public class Outter {
	String field = "Outter-field";
	void merthod() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void merthod() {
			System.out.println("Nested-method");
	}
	
	void print() {
		System.out.println(this.field);
		this.merthod();
		System.out.println(Outter.this.field);
		Outter.this.merthod();
	}
	
	
	
	
	
	
	
	}
	
}
