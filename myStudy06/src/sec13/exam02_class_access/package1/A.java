package sec13.exam02_class_access.package1;

public class A {

	A a1 = new A(true);
	A a2 = new A();
	A a3 = new A("���ڿ�");

	public A(boolean b) {}  // --import�ϸ� �ٸ� ��Ű������ ��밡��

	A() {}  // -- ���� ��Ű�������� ��밡��

	private A(String s) {}  // -- private �� A������ ��밡��

}
