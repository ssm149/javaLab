package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.*;

public class C {
	C(){
		
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;  ����Ʈ�� ���Ұ�
		//a.field3 = 1;  -- private �̶� ���Ұ�
		
		a.method1();
		//a.method2();   ����Ʈ�� ���Ұ�
		//a.method3();-- private �̶� ���Ұ�
	}
}
