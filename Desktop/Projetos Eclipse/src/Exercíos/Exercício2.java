package Exercíos;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner leia= new Scanner(System.in);
		
		int idadeDias, idadeMeses,idadeAno;
		
		System.out.println("Qual a sua idade em dias? ");
		idadeDias=leia.nextInt();
		
		idadeAno=idadeDias/365;
		idadeMeses=idadeDias/30;
		
		System.out.println("\n A sua idade em anos é de: " +idadeAno+" anos");
		System.out.println("\n A sua idade em meses é de: " +idadeMeses+" meses");
		System.out.println("\n A sua idade em dias é de: " +idadeDias+" dias");

	}

}
