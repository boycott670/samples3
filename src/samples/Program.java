package samples;

import java.lang.reflect.Modifier;

public class Program {

	public static void main(String[] args) {
		final int stringClassModifiers = String.class.getModifiers();
		
		assert Modifier.isFinal(stringClassModifiers) && Modifier.isPublic(stringClassModifiers);
	}

}
