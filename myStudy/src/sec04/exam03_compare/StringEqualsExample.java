package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVal1 = "�ſ��";
		String strVal2 = "�ſ��";
		String strVal3 = new String("�ſ��");
		
		System.out.println(strVal1 == strVal2);
		System.out.println(strVal1 == strVal3);
		System.out.println();
		System.out.println(strVal1.equals(strVal2));
		System.out.println(strVal1.equals(strVal3));
		
	}

}
