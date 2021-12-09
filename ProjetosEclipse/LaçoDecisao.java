package Exercíos;

import java.util.Scanner;

public class LaçoDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,media;
		
		Scanner leia= new Scanner (System.in);
		
		System.out.println("\n Entre com a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\n Entre com a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\n Entre com a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("\n A sua média foi:" +media);
		
		if(media>=7 && media<=10)
		{
			System.out.println("\n Alune aprovade...");
		}
		
		else if(media>=5 && media<7)
		{
			System.out.println("\n Alune de exame...");
			
		}
		
		else
		{
			System.out.println("\n Alune reprovade...");
		}

	}

}
