programa
{
	
	funcao inicio()
	{
		nteiro numero, somaNumero=0

		escreva("\nEntre com um número: ")
		leia(numero) // 7

		enquanto(numero!=0)
		{
			somaNumero += numero // somaNumero = somaNumero + numero
			escreva("\nEntre com um número: ")
			leia(numero)
		}

		escreva("\nSomatório dos números lidos foi de: ",somaNumero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 334; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */