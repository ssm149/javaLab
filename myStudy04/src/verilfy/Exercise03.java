package verilfy;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;

			}
		}
		System.out.println(sum);

	}

}
