package Exerc�os;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner leia= new Scanner(System.in);
		
		int idadeDias, idadeMeses,idadeAno;
		
		System.out.println("Qual a sua idade em dias? ");
		idadeDias=leia.nextInt();
		
		idadeAno=idadeDias/365;
		idadeMeses=idadeDias/30;
		
		System.out.println("\n A sua idade em anos � de: " +idadeAno+" anos");
		System.out.println("\n A sua idade em meses � de: " +idadeMeses+" meses");
		System.out.println("\n A sua idade em dias � de: " +idadeDias+" dias");

	}

}
