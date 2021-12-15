package Exerc�os;

public class Aviao {
	
	private String passageiroAviao;
	private String linhaArea;
	private float pre�oPassagem;
	private String aeroporto;
	private String destino;
	
	public Aviao (String passageiroAviao,String linhaArea, float pre�oPassagem,String aeroporto,String destino)
	{
		this.passageiroAviao=passageiroAviao;
		this.linhaArea=linhaArea;
		this.pre�oPassagem=pre�oPassagem;
		this.aeroporto=aeroporto;
		this.destino=destino;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n O passageiro: "+passageiroAviao+ ", comprou uma passagem na linha �rea " +linhaArea+
				"\n e pagou "+pre�oPassagem+ " reais. Ele ir� sair de "+aeroporto+ " e ir� para "+destino+ ".");
	}

	public String getPassageiroAviao() {
		return passageiroAviao;
	}

	public void setPassageiroAviao(String passageiroAviao) {
		this.passageiroAviao = passageiroAviao;
	}

	public String getLinhaArea() {
		return linhaArea;
	}

	public void setLinhaArea(String linhaArea) {
		this.linhaArea = linhaArea;
	}

	public float getPre�oPassagem() {
		return pre�oPassagem;
	}

	public void setPre�oPassagem(float pre�oPassagem) {
		this.pre�oPassagem = pre�oPassagem;
	}

	public String getAeroporto() {
		return aeroporto;
	}

	public void setAeroporto(String aeroporto) {
		this.aeroporto = aeroporto;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	

}
