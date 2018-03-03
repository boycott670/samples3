package samples;

import java.lang.reflect.Modifier;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int stringClassModifiers = String.class.getModifiers();
		
		assert Modifier.isFinal(stringClassModifiers) && Modifier.isPublic(stringClassModifiers);
	}

}
