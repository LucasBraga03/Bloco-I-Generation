package Exerc�os;

public class Pregui�aPolimorfismo extends AnimalPolimorfismo {
	
	public Pregui�aPolimorfismo()
	{
		super("Pregui�a");
	}
	
	@Override
	public void som(String barulho)
	{
		System.out.println ("\n O barulho da pregui�a � ahhh");
	}

}
