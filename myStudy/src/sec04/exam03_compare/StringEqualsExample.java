package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVal1 = "신용권";
		String strVal2 = "신용권";
		String strVal3 = new String("신용권");
		
		System.out.println(strVal1 == strVal2);
		System.out.println(strVal1 == strVal3);
		System.out.println();
		System.out.println(strVal1.equals(strVal2));
		System.out.println(strVal1.equals(strVal3));
		
	}

}
