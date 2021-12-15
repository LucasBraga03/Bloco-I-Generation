package Exercíos;

public class Aviao {
	
	private String passageiroAviao;
	private String linhaArea;
	private float preçoPassagem;
	private String aeroporto;
	private String destino;
	
	public Aviao (String passageiroAviao,String linhaArea, float preçoPassagem,String aeroporto,String destino)
	{
		this.passageiroAviao=passageiroAviao;
		this.linhaArea=linhaArea;
		this.preçoPassagem=preçoPassagem;
		this.aeroporto=aeroporto;
		this.destino=destino;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n O passageiro: "+passageiroAviao+ ", comprou uma passagem na linha área " +linhaArea+
				"\n e pagou "+preçoPassagem+ " reais. Ele irá sair de "+aeroporto+ " e irá para "+destino+ ".");
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

	public float getPreçoPassagem() {
		return preçoPassagem;
	}

	public void setPreçoPassagem(float preçoPassagem) {
		this.preçoPassagem = preçoPassagem;
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
