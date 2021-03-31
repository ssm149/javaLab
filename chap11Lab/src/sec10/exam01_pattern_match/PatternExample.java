package sec10.exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; // ���Խ�, \t = ��Ű
		String data = "010-123-4567";  // ���� ������
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		// "angel@naver.co.kr"  �̰͵� ��밡��
		data = "angel@naver.com";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}

	}

}
