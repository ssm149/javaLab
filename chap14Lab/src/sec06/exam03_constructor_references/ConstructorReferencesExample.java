package sec06.exam03_constructor_references;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) {

		// �͸�����ü
		Function<String, Member> function1 = new Function<String, Member>() {
			@Override
			public Member apply(String t) {
				return new Member(t);
			}
		};

		// ���ٽ�
		function1 = t -> new Member(t);

		// ������ ����
		function1 = Member::new;
		Member member1 = function1.apply("angel");

		BiFunction<String, String, Member> function2 = Member::new;
		Member member2 = function2.apply("��õ��", "angel");
	
	}
}
//Function<String, Member>