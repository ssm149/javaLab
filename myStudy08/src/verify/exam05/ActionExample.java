package verify.exam05;

public class ActionExample {
	public static void main(String[] args) {
		// �ۼ� ��ġ
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("���縦 �մϴ�.");
			}

		};

		action.work();
	}

	// ���� ���
	// ���縦 �մϴ�.
}
