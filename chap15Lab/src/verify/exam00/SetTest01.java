package verify.exam00;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import sec03.exam01_hashset.Member;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Set s = new HashSet();
		// TreeSet s = new TreeSet();  -- ���� ���İ���

		Random r = new Random();

		// �ۼ� ��ġ
		// Set�� �̿��� �ζ�

		/*
		 * while (s.size() != 6) s.add(r.nextInt(45) + 1); System.out.println(s);
		 */
		while (s.size() != 6) {
			n = r.nextInt(45) + 1; // 1~45 ������ ����
			s.add(n);
		}
		// ���� : set -> list �����Ͽ� Collection.sort()�� �̿��Ͽ� �����Ѵ�.
		List list = new ArrayList(s);
		Collections.sort(list);
		
		System.out.println(s);
		System.out.println(list);
	}

}
// ������
// ���� ��)[7, 41, 25, 27, 29, 15]