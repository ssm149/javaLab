package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValue = byteValue;   // �ڵ�Ÿ�� ��ȯ:  int(4 bytes) <- byte(1byte)
		System.out.println(intValue);  // 10
		
		char charValue = '��';
		intValue = charValue;   // �ڵ�Ÿ�� ��ȯ: int(4 bytes) <- char(2 bytes)
		System.out.println("���� �����ڵ�=" + intValue);  // 44032
		
		intValue = 500;
		long longValue = intValue;  //�ڵ�Ÿ�� ��ȯ: long(8 bytes) <- int(4 bytes)
		System.out.println(longValue);  // 500
		
		double doubleValue = intValue;  // �ڵ�Ÿ�� ��ȯ: double(8 bytes) <- int(4 bytes)
		System.out.println(doubleValue);  // 500.0
		

	}

}
