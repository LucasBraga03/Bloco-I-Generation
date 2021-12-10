package Exercíos;

import java.util.Scanner;

public class Exercicio6LaçoRepetição {

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
		System.out.println("\n A medía dos números múltiplos de 3 é: "+media);
	}

}
