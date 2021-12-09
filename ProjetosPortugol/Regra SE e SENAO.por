programa
{
	
	funcao inicio()
	{
		real nota1,nota2,nota3,media

		escreva("\n Entre com a primeira nota: ")
		leia(nota1)
		escreva("\n Entre com a segunda nota: ")
		leia(nota2)
		escreva("\n Entre com a terceira nota: ")
		leia(nota3)

		media=(nota1+nota2+nota3)/3

		escreva("\n Sua média foi de: ", media)

		se(media>=7.0 e media<=10.)

		{
			escreva("\n Aluno Aprovado ")
		}

		senao se(media>=0.0 e media <7.0)
		{
			escreva("\n Aluno Reprovado ")
		}

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 483; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */