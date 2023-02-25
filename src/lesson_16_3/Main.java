package lesson_16_3;

import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Class<?> methodsClass = Class.forName("lesson_16_3.Methods"); 
		
		Object obj = methodsClass.newInstance();
		Method method1 = methodsClass.getDeclaredMethod("myMethod", String.class);
		Method method2 = methodsClass.getDeclaredMethod("myMethod", String.class, int.class);
		method1.invoke(obj, "Method 1.");
		method2.invoke(obj, "Method 2", 2);
	}

}
