package verify.exam03;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {

		// Student Ű�� ������ �����ϴ� HashMap ��ü ����
		// Map : {Key, Value} ������ ������ �ڷᱸ���� �������̽�
		// HashMap : Map �������̽��� ������ ���� Ŭ����
		// ���ʸ� Ÿ�� : Ÿ���� �Ķ���͸� ���� Ŭ������ �������̽��� ���Ѵ�.
		HashMap<Student, String> hashMap = new HashMap<Student, String>();

		// new Student("1")�� ���� 95�� ����
		hashMap.put(new Student("1"), "95");

		// new Student("1") �� ������ �о��
		String score = hashMap.get(new Student("1"));
		System.out.println("1�� �л��� ����: " + score);

	}

}
