package sec15.exam01_annotation;

import java.lang.reflect.*;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				System.out.println(method.getName() + "에는 적용되어 있음");
				PrintAnnotation printAnnotation =
						method.getAnnotation(PrintAnnotation.class);
				
				System.out.println(method.getName() + ": ");
				System.out.println(printAnnotation.value());
				System.out.println(printAnnotation.number());
				System.out.println();
			}
		}
		
		
	}

}
