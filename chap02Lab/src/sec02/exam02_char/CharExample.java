package sec02.exam02_char;

public class CharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = '��';   // ���ڸ� ���� �����Ѵ�.
		char c2 = 65;   // �������� ����
		char c3 = '\u0041';  // 16������ ����
		
		char c4 = '��';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int uniCode = c1;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);

	}

}