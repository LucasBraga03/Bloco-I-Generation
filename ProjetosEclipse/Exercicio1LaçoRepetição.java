package Exerc�os;

import java.util.Scanner;

public class Exercicio1La�oRepeti��o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia= new Scanner(System.in);
		
		float restoDivis�o, guardaValor;
		int x;
		
		for(x=1000; x<=1999;x++)
		{
			if(x%11==5)
			{
				guardaValor=x;
				System.out.println("\n Os valores que s�o dividios por 11 e sobra 5 s�o: "+x);
			}
		}
		
		

	}

}
