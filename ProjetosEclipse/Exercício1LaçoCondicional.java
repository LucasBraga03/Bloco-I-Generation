package Exerc�os;

import java.util.Scanner;

public class Exerc�cio1La�oCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia=new Scanner (System.in);
		
		int n1, n2,n3;
		
		System.out.println("\n Informe o primeiro valor: ");
		n1 = leia.nextInt();
		System.out.println("\n Informe o segundo valor: ");
		n2 = leia.nextInt();
		System.out.println("\n Informe o terceiro valor: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("\n O primeiro n�mero � o maior valor informado. ");
		}
		else if(n2>n3 && n2>n1)
		{
			System.out.println("\n O segundo n�mero � o maior valor informado. ");
		}
		else
		{
			System.out.println("\n O terceiro n�mero � o maior valor informado. ");
		}
				
		

	}

}
