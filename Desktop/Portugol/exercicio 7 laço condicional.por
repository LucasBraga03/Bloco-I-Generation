programa
{
	
	funcao inicio()
	{
		real base,altura,area

		escreva("\n Qual a Base do triângulo? ")
		leia(base)
		escreva("\n Qual a altura do triângulo? ")
		leia(altura)

		area=(base*altura)/2

		se(area>0)
		{
			escreva("\n A informação fornecida é válida e a área de seu triângualo é: ",area)
		}
		senao se(area<0)
		{
			escreva("\n A informação não é válida, tente novamente.")
		}
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