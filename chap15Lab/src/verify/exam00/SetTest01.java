package verify.exam00;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import sec03.exam01_hashset.Member;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Set s = new HashSet();
		// TreeSet s = new TreeSet();

		Random r = new Random();

		// �ۼ� ��ġ
		// Set�� �̿��� �ζ�
		while (s.size() != 6)
			s.add(r.nextInt(45) + 1);
		System.out.println(s);

	}

}
// ������
// ���� ��)[7, 41, 25, 27, 29, 15]