package sec02.exam01_nested;

public class A {

	A() {
		System.out.println("A 按眉啊 积己凳.");

		B b = new B();
		b.field1 = 3;
		b.method1();
	}

	class B {
		int field1;

		// static int field2;
		B() {
			System.out.println("B 按眉啊 积己凳.");
		}

		void method1() {
		}
		// static void method2() {}
	}

	static class C {
		int field1;
		static int field2;

		C() {
			System.out.println("C按眉啊 积己凳");
		}

		void method1() {
		}

		static void method2() {
		}
	}

	void method() {
		class D {
			int field1;
			// static int field2;
			
			D() {
				System.out.println("D按眉啊 积己凳");
			}

			void method1() {  }
			// static void method2() { }
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

}
