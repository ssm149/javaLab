package sec04.exam01_arithmetic;

public class AccuracyExample2 {

	public static void main(String[] args) {
//		double result = 7 * 0.1;
//		System.out.println(result);
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + "조각이 남는다.");

		
		
	}

}
