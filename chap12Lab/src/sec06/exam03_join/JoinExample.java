package sec06.exam03_join;

public class JoinExample {
	//main �����尡 ����
	public static void main(String[] args) {
		// �۾� �����带 ����
		SumThread sumThread = new SumThread();
		// �۾� �����尡 ����
		sumThread.start();
		try {
			// main �����尡 �۾� �����尡 �Ϸ�ɶ����� �Ͻô����·� �ִ´�.
			sumThread.join();
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 ��: " + sumThread.getSum());
	}
}

