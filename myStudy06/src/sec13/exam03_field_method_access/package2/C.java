package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.*;

public class C {
	C(){
		
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;  디폴트라 사용불가
		//a.field3 = 1;  -- private 이라 사용불가
		
		a.method1();
		//a.method2();   디폴트라 사용불가
		//a.method3();-- private 이라 사용불가
	}
}
