package sec02.exam01_createthread;

<<<<<<< HEAD
public class ThreadLife implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 21; i++) {
			// thread�� �̸��� ���� ���
			System.out.println(Thread.currentThread().getName() + " number = " + i);
		}
	}

	public static void main(String[] args) {
		ThreadLife tl = new ThreadLife();

		// ù ��° Thread ����
		Thread first = new Thread(tl, "first1");
		// �� ��° Thread ����
		Thread second = new Thread(tl, "second1");
		// �� ��° Thread ����
		Thread third = new Thread(tl, "third1");

=======
//Runnable �������̽��� ���� Ŭ����
public class ThreadLife implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 21; i++) {
			// thread�� �̸��� ���� ���
			System.out.println(Thread.currentThread().getName() + " number = " + i);
		}
	}

	//  Main Thread�� main() �޼ҵ带 �����Ѵ�
	public static void main(String[] args) {
		ThreadLife tl = new ThreadLife();   // tl�� Runnable �������̽��� ������ü

		// ù ��° Thread ���� : �۾� ������
		Thread first = new Thread(tl, "first1");
		// �� ��° Thread ���� 
		Thread second = new Thread(tl, "second1");
		// �� ��° Thread ����
		Thread third = new Thread(tl, "third1");

		// Multi-tasking
>>>>>>> refs/remotes/origin/master
		second.start();
		first.start();
		third.start();
	}

}
