programa
{
	
	funcao inicio()
	{
		real segundos,minutos,horas,DuracaoFesta

		escreva("\n Qual será o tempo da duração da festa em segundos? ")
		leia(DuracaoFesta)

		segundos=DuracaoFesta
		minutos=segundos/60
		horas=minutos/60

		escreva("\n O tempo de duração da festa em segundos é: ",segundos)
		escreva("\n O tempo de duração da festa em minutos é: ", minutos)
		escreva("\n O tempo de duração da festa em horas é: ", horas)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */