package sec03.exam02_while;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}

		System.out.println("1~" + (i - 1) + "까지의 합은 :" + sum);

	}

}
