programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("\n Qual a sua idade? ")
		leia(idade)

		se(idade>= 5.0 e idade <=7.0)

		{
			escreva("\n Você faz parte do time infantil A")
		}
		senao se(idade>= 8.0 e idade <=11.0)

		{
			escreva("\n Você faz parte do time infantil B")
		}
		senao se(idade>= 12.0 e idade <=13.0)

		{
			escreva("\n Você faz parte do time Juvevil A")
		}
		senao se(idade>= 14.0 e idade <=17.0)

		{
			escreva("\n Você faz parte do time Juvevil B")
		}
		senao se(idade>= 18)

		{
			escreva("\n Você faz parte do time de Adultos")
		}
		senao se (idade<5)
		{
			escreva("\n Ainda não temos uma turma para você, mas estamos trabalhando para melhor atender. ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 705; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */