package sec02.exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// -128 <= byte <= 127
		// -2^31 <= int < = 2^31-1
		byte var1 = 125;
		int var2 = 125;
		
		// �ݺ���
		// i=0���� �ϳ��� �����Ͽ� 5���� ���������� �ݺ��Ѵ�.
		for (int i=0; i<5; i++) {
			var1++;   //  var1 = var1 + 1;   // 125 + 1 = 126
			var2++;   //  var2 = var2 + 1;   // 125 + 1 = 126
			System.out.println("var1="+var1);
			System.out.println("var2="+var2);
		}

	}

}
