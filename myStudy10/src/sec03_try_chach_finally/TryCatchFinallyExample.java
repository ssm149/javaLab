package sec03_try_chach_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("java.lang.String");
		System.out.println("Ŭ������ ã�ҽ��ϴ�.");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}finally {
			System.out.println("���α׷��� �����ϰ� �����մϴ�.");
		}

	}

}
