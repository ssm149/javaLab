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
		// TreeSet s = new TreeSet();  -- 쉽게 정렬가능

		Random r = new Random();

		// 작성 위치
		// Set을 이용한 로또

		/*
		 * while (s.size() != 6) s.add(r.nextInt(45) + 1); System.out.println(s);
		 */
		while (s.size() != 6) {
			n = r.nextInt(45) + 1; // 1~45 임의의 정수
			s.add(n);
		}
		// 정렬 : set -> list 변경하여 Collection.sort()를 이용하여 정렬한다.
		List list = new ArrayList(s);
		Collections.sort(list);
		
		System.out.println(s);
		System.out.println(list);
	}

}
// 실행결과
// 추출 예)[7, 41, 25, 27, 29, 15]