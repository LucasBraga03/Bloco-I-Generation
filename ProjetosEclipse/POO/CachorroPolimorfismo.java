package Exercíos;

public class CachorroPolimorfismo extends AnimalPolimorfismo {
	
	public CachorroPolimorfismo()
	{
		super("Cachorro");
	}
	
	@Override
	public void som(String barulho)
	{
		System.out.println("\n O Barulho do cachorro é huf huf" );
	}

}
