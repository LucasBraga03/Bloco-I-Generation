programa
{
	
	funcao inicio()
	{
		real pontos[5], valorMaior=0.0, n1,n2=0.0
		inteiro x

		para(x=0;x<5;x++)
		{
			escreva("\n Qual foi a sua pontuação na atividade? ")
			leia(n1)

			pontos[x]=n1
			

			se(valorMaior<pontos[x])
			{
				valorMaior=pontos[x]
			}
		}

		escreva("\n A pontuação 1 foi de: ",pontos[0])
		escreva("\n A pontuação 2 foi de: ",pontos[1])
		escreva("\n A pontuação 3 foi de: ",pontos[2])
		escreva("\n A pontuação 4 foi de: ",pontos[3])
		escreva("\n A pontuação 5 foi de: ",pontos[4])
		escreva("\n A maior pontuação é de: ",valorMaior)
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */