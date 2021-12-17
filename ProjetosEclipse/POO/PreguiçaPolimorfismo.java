package Exercíos;

public class PreguiçaPolimorfismo extends AnimalPolimorfismo {
	
	public PreguiçaPolimorfismo()
	{
		super("Preguiça");
	}
	
	@Override
	public void som(String barulho)
	{
		System.out.println ("\n O barulho da preguiça é ahhh");
	}

}
