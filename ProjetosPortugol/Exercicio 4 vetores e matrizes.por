programa
{
	
	funcao inicio()
	{
		real n1[3][3], somaTotal=0.0, somaDiagonal=0.0
		inteiro l,c

		para (l=0;l<3;l++)
		{
			para(c=0;c<3;c++)
			{
			escreva("\n Entre com o valor de n1: ")
			leia(n1[l][c])

			somaTotal+=n1[l][c]

			se(l == c)
			{
				somaDiagonal+=n1[l][c]
			}

			
			}
			
		}

		escreva("\n A soma total dos valores é de: ", somaTotal)
		escreva("\n A soma total da diagonal é de: ", somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 238; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 7, 2}-{somaTotal, 6, 17, 9}-{somaDiagonal, 6, 32, 12}-{l, 7, 10, 1}-{c, 7, 12, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */