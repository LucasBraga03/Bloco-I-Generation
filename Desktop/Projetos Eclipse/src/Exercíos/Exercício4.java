package Exercíos;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia= new Scanner(System.in);
		
		int a,b,c,s,r,d;
		
		System.out.println(" Qual o valor de A? ");
		a=leia.nextInt();
		System.out.println("\n Qual o valor de B? ");
		b=leia.nextInt();
		System.out.println("\n Qual o valor de C? ");
		c=leia.nextInt();
		
		r=(a+b)*(a+b);
		s=(b+c)*(b+c);
		d=(r+s)/2;
		
		System.out.println("\n O valor de D é: " +d);
		

	}

}
