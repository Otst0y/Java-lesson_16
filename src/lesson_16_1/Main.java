package lesson_16_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		Class product = Product.class;

		// Class name.
		String className = product.getName();
		System.out.println(className);
		String simpleClassName = product.getSimpleName();
		System.out.println(simpleClassName);
		System.out.println();

		// Modifiers.
		int modifiers = product.getModifiers();
		System.out.println(Modifier.isPublic(modifiers));
		System.out.println(Modifier.isStatic(modifiers));
		System.out.println();

		// Package info.
		Package Package = product.getPackage();
		System.out.println(Package);
		String packageName = product.getPackageName();
		System.out.println(packageName);
		System.out.println();

		// Fields.
		Field[] fields = product.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName() + " " + field.getType());
		}
		System.out.println();

		// Constructors.
		Constructor[] conctructors = product.getConstructors();
		for (Constructor key : conctructors) {
			System.out.println(key);
		}
		System.out.println();

		// Methods.
		Method[] methods = product.getMethods();
		for (Method key : methods) {
			System.out.println(key);
		}

	}

}
