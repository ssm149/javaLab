package sec12.exam01_wrapper;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Boxing : 참조형 (heep) <- 기본현(stack)
		Integer obj1 = new Integer(100);       // Integer <- 기본형
		Integer obj2 = new Integer("200");   // Integer <- String
		Integer obj3 = Integer.valueOf("300"); //Integer <- String
		
		//UnBoxing : 기본현 <- 참조형
		int value1 = obj1.intValue(); 
		int value2 = obj2.intValue(); 
		int value3 = obj3.intValue(); 
		
		System.out.println(value1);		
		System.out.println(value2);
		System.out.println(value3);

	}

}
