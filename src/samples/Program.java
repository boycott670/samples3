package samples;

import samples.entities.ScrumMaster;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		assert args != null && args.length != 0 && args [0] != null && args [0].length() != 0 && args [0].startsWith("x") && args [0].length() < 4 && new ScrumMaster(args[0], null).getLovesNumber() == null;

	}

}
