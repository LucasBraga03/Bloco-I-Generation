package Exercíos;

import java.util.Scanner;

public class Exercicio3matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] numeros= new int [3][3];
		int contador1=0, linha, coluna, maior10;
		Scanner leia=new Scanner (System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\n Entre com um valor: ");
				numeros[linha][coluna]=leia.nextInt();
				
				if(numeros[linha][coluna]>10)
				{
					contador1++;
				}
			}
			
		}
		
		System.out.println("\n São "+contador1+ " números maiores que 10 e esses números são: ");
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				if(numeros[linha][coluna]>10)
				{
					System.out.println(numeros[linha][coluna]);
				}
			}
		}
	
		

	}

}
