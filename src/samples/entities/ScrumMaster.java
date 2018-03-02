package samples.entities;

import samples.Programmer;

public class ScrumMaster extends Programmer
{

	public ScrumMaster(String name, Class<? extends Number> lovesNumber)
	{
		super(name, lovesNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return String.format("%s[%s]", super.toString(), getLovesNumber().getName());
	}

}
