package sec04.exam01_field;

public class UsingThis {
	public int outterField = 10;

	// �ν��Ͻ� ��� Ŭ����
	class Inner {
		int innerField = 20;

		void method() {
			//���ٽ�
			MyFunctionalInterface fi= () -> {
				System.out.println("outterField: " + outterField);  //outterField : 10
				System.out.println("outterField: " + UsingThis.this.outterField + "\n");  //UsingThis.this�� ���� ��ü
				
				System.out.println("innerField: " + innerField);  //innerField : 20
				System.out.println("innerField: " + this.innerField + "\n");  // this �� ���� ��ü
			};
			fi.method();
		}
	}
}

