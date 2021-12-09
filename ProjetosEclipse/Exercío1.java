package Exercíos;

import java.util.Scanner;

public class Exercío1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leia= new Scanner(System.in);
		
		int idadeDias, idadeMeses,idadeAno, idadeFinal, n1,n2;
		
		System.out.println("Qual é a sua idade em anos? ");
		idadeAno=leia.nextInt();
		System.out.println("Qual a sua idade em meses? ");
		idadeMeses=leia.nextInt();
		System.out.println("Qual a sua idade em dias? ");
		idadeDias=leia.nextInt();
		
		n1=idadeAno*365;
		n2=idadeMeses*30;
		idadeFinal=idadeDias+n1+n2;
		
		System.out.println("A sua idade em dias é: "+idadeFinal+ " dias");
		
	}

}
