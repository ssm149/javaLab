package sec07.exam02_field_initialize;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("김자바", "01090692492");
		Korean k2 = new Korean("박자바", "01099992492");
		
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println();
		
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}
