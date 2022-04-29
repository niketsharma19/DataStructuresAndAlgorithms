package practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		Test test = new Test();
		Class<? extends Test> testClass = test.getClass();

		// Accessing Private Variable
		Field name = testClass.getDeclaredField("name");
		name.setAccessible(true);
		String res = (String) name.get(test);
		System.out.println(res);
		
		// Accessing Private Method
		Method getName = testClass.getDeclaredMethod("getName", null);
		getName.setAccessible(true);
		System.out.println(getName.invoke(test, null));

	}

}
