package sec07_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		
		Account ac = new Account();
		// �����ϱ�
		ac.deposit(10000);
		System.out.println("���ݾ� : " + ac.gerBalance());
		
		// ����ϱ�
		try {
			ac.withdraw(3000);
			System.out.println("���ݾ� : " + ac.gerBalance());
		} catch (BalanceInsufficientException e) {
			System.out.println("���� �߻�");
		}
		
	}

}
