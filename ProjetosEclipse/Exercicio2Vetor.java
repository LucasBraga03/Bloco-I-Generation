package Exercíos;

import java.util.Scanner;

public class Exercicio2Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner leia=new Scanner (System.in);
	
	int [] num1 = new int[6];
	int somapar=0, somaimpar=0,guardaPar=0,guardaImpar=0;
	int x;
	
	for(x=0;x<6;x++)
	{
		System.out.println("\n Entre com o valor desejado. ");
		num1[x]=leia.nextInt();
		
		if(num1[x]%2==0)
		{
			
			somapar+=num1[x];
			//System.out.println("\n Os números pares digistados foram: " +num1[x]+ " e a soma foi " +somapar);
		}
		
		else if(num1[x]%2==1)
		{
			
			somaimpar++;
			
		}
		
	}
	
		System.out.println("\n A soma dos números pares deu: " +somapar);
		System.out.println("\n Os números pares digitados foram: ");
		
		for(x=0; x<6; x++)
		{
			if(num1[x]%2==0)
			{
				System.out.println("\n"+num1[x]);
			}
		}
		System.out.println("\n A quantidade de números ímpares digitados foi: "  +somaimpar);
		System.out.println("\n Os números ímpares digitados foram: ");
		for(x=0;x<6;x++)
		{
			if(num1[x]%2!=0)
			{
				System.out.println(num1[x]);
			}
		}
		
		
		
		
		
	}

}
