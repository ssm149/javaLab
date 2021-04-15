package sec06.exam01_protected_pacage2;

import sec06.exam01_protected_pacage1.*;

public class D extends A{
	public D() {
		super();
		this.field= "value";
		this.method();
		
	}
	public void method() {
		this.field= "value";
		this.method();
		
	}
	
}
