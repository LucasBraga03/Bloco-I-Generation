package Exercíos;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro dog=new Cachorro("Billy","3","Late","Correr");
		Cavalo cav=new Cavalo("Bob","4","Barulho de Cavalo","Correr");
		Preguiça pregui=new Preguiça("Robert","1","Barulho de preguiça","Subir em árvore");
		dog.imprima();
		cav.imprima();
		pregui.imprima();
	}

}
