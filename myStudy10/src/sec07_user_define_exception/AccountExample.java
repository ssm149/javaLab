package sec07_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		
		Account ac = new Account();
		// 예금하기
		ac.deposit(10000);
		System.out.println("예금액 : " + ac.gerBalance());
		
		// 출금하기
		try {
			ac.withdraw(3000);
			System.out.println("예금액 : " + ac.gerBalance());
		} catch (BalanceInsufficientException e) {
			System.out.println("예외 발생");
		}
		
	}

}
