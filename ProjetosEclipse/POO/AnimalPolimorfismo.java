package Exercíos;

public abstract class AnimalPolimorfismo {
	
	private String tipo;
	
	public AnimalPolimorfismo(String tipo)
	{
		this.tipo=tipo;
	}
	
	abstract public void som(String barulho);

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
