package sec08.examo04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		double result1 = myCalcu.areaRectangle(10);
		System.out.println(result1);
		
		double result2 = myCalcu.areaRectangle(10, 20);
		System.out.println(result2);
		
	}

}
