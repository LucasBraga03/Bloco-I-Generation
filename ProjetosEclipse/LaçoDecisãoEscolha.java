package Exercíos;

import java.util.Scanner;

public class LaçoDecisãoEscolha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("\n Faça o dia de alguém feliz ");
		System.out.println("\n 1- Bom dia ");
		System.out.println("\n 2- Um frappuccino de brigadeiro ");
		System.out.println("\n 3- 10.000 reais na sua conta ");
		System.out.println("\n 4- 1 litro de açaí e um doce cupuaçu ");
		System.out.println("\n Escolha a sua opção ");
		
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
			System.out.println( "\n 1 litro de açaí e um doce de cupuaçu ");
		default:
			System.out.println("\n Opção inválida ");
			
				
		}
		
		

	}

}
