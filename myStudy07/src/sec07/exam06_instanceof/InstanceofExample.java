package sec07.exam06_instanceof;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
		System.out.println("method - Child �� ��ȯ ����");
		}else {
			System.out.println("method - Child �� ��ȯ ��������");
		}
	}

	public static void method2(Parent parent) {
		System.out.println("method - Child �� ��ȯ ����");
	}
	
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);

		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}
}
