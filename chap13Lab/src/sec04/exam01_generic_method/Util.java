package sec04.exam01_generic_method;

public class Util {
	// ���ʸ� �޼ҵ�
	// �޼ҵ� ���� : ����Ÿ�� �޼Ҹ�(�Ű�����) { ... }
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
