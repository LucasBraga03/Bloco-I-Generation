package Exerc�os;

import java.util.Scanner;

public class La�oDecis�oEscolha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("\n Fa�a o dia de algu�m feliz ");
		System.out.println("\n 1- Bom dia ");
		System.out.println("\n 2- Um frappuccino de brigadeiro ");
		System.out.println("\n 3- 10.000 reais na sua conta ");
		System.out.println("\n 4- 1 litro de a�a� e um doce cupua�u ");
		System.out.println("\n Escolha a sua op��o ");
		
		op = ler.nextInt();
		
		switch (op)
		{
		case 1:
			System.out.println("\n Bom dia ");
			break;
		case 2:
			System.out.println("\n Um frappuccino de brigadeiro ");
			break;
		case 3:
			System.out.println("\n 10.000 reais na sua conta ");
			break;
		case 4:
			System.out.println( "\n 1 litro de a�a� e um doce de cupua�u ");
		default:
			System.out.println("\n Op��o inv�lida ");
			
				
		}
		
		

	}

}
