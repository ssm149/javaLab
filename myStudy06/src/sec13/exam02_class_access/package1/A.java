package sec13.exam02_class_access.package1;

public class A {

	A a1 = new A(true);
	A a2 = new A();
	A a3 = new A("문자열");

	public A(boolean b) {}  // --import하면 다른 패키지에서 사용가능

	A() {}  // -- 같은 패키지에서만 사용가능

	private A(String s) {}  // -- private 은 A에서만 사용가능

}
