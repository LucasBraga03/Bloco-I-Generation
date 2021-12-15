package Exercíos;

public class Cachorro extends Animal {
	
	private String habilidade;
	
	public Cachorro(String nome, String idade, String som, String habilidade)
	{
		super(nome,idade,som);
		this.habilidade=habilidade;
	}

}
