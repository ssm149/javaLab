package sec02.exam01_none_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("ȫ�浿");  // ����ȯ, Object <- String
		String name = (String) box.get();  // ����ȯ, String <- String
		
		box.set(new Apple());  // ����ȯ,  Object <- Apple
		Apple apple = (Apple) box.get();   // ����ȯ,  Apple <- Object
	}

}
