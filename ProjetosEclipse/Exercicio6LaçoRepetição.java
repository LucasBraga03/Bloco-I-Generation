package Exerc�os;

import java.util.Scanner;

public class Exercicio6La�oRepeti��o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia=new Scanner (System.in);
		
		int numVariados, somaMedia=0,entradaMedia=0;
		float media;
		
		System.out.println("\n Entre com um valor: ");
		numVariados=leia.nextInt();
		
		do
		{
			if(numVariados%3==0)
			{
				somaMedia+=numVariados;
				entradaMedia++;	
			}
		
		System.out.println("\n Entre com um valor: ");
		numVariados=leia.nextInt();
			
		}
		while(numVariados != 0);
		
		media=(float) somaMedia/entradaMedia;
		System.out.println("\n A med�a dos n�meros m�ltiplos de 3 �: "+media);
	}

}
