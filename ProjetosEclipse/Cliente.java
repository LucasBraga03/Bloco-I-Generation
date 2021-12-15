package Exercíos;

public class Cliente {
	
	private String nomeCliente;
	private int idadeCliente;
	private int telCliente;
	private int cpfCliente;
	private String ruaCliente;
	private int numeroCasa;
	
	public Cliente (String nomeCliente, int idadeCliente, int cpfCliente, String ruaCliente, int numeroCasa,int telCliente)
	{
		this.nomeCliente=nomeCliente;
		this.idadeCliente=idadeCliente;
		this.telCliente=telCliente;
		this.cpfCliente=cpfCliente;
		this.ruaCliente=ruaCliente;
		this.numeroCasa=numeroCasa;
				
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n O cliente "+nomeCliente+ ", de " +idadeCliente+ 
				" anos. Portador do CPF: " +cpfCliente+ ",\n residente da rua " +ruaCliente+ " número: "  +numeroCasa+ ", realizou uma compra em nossa loja. "
						+ "\nPara entrar em contato, basta ligar no número: " +telCliente);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getIdadeCliente() {
		return idadeCliente;
	}

	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}

	public int getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(int telCliente) {
		this.telCliente = telCliente;
	}

	public int getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getRuaCliente() {
		return ruaCliente;
	}

	public void setRuaCliente(String ruaCliente) {
		this.ruaCliente = ruaCliente;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	
	
	

}
