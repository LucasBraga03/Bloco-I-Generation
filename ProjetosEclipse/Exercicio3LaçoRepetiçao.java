package Exerc�os;

import java.util.Scanner;

public class Exercicio3La�oRepeti�ao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia=new Scanner (System.in);
		
		int idade,idade21=0,idade50=0, idadeQualquer=0;
		
		System.out.println("\n Quatos anos voc� tem? ");
		idade = leia.nextInt();
		
		while(idade != -99)
		{
		
			if(idade<21)
			{
				idade21++;
			}
			
			else if(idade>50)
			{
				idade50++;
			}
			else
			{
				idadeQualquer++;
			}
			System.out.println("\n Quatos anos voc� tem? ");
			idade = leia.nextInt();
				
			
		}
		
		System.out.println("\n O n�mero de pessoas que tem menos que 21 anos �: " +idade21+ " pessoas. ");
		System.out.println("\n O n�mero de pessoas que tem mais que 50 anos �: " +idade50+ " pessoas. ");

	}

}
