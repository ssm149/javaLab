package sec07.exam02_method;

public class StringValueOfExample {
	public static void main(String[] args) {
		String str1 = String.valueOf(10);      // 10 -> "10",  Ÿ�Ժ�ȯ : ������ <- �⺻��	
		String str2 = String.valueOf(10.5);  // 10.5 -> "10.5"
		String str3 = String.valueOf(true);  // true  -> "true"

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
