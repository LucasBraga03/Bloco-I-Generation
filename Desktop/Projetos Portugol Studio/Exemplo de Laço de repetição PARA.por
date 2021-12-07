programa
{
	
	funcao inicio()
	{
		real n1,n2,n3,media,mediaGeral,somaMedia=0.0
		inteiro x
		cadeia nome

		para(x=1;x<=5;x++) // x = x + 1  x = x - 1
		{
			escreva("\nEntre com o seu nome: ")
			leia(nome)
			escreva("\nNotas do alune ",nome)
			escreva("\nEntre com a primeira nota: ")
			leia(n1)
			escreva("\nEntre com a segunda nota: ")
			leia(n2)
			escreva("\nEntre com a terceira nota: ")
			leia(n3)

			media = (n1+n2+n3) / 3   // 8.5  6.5
			se(media>=7.0 e media<=10.0)
			{
				escreva("\nAlune: ",nome," você foi aprovade...")
			}
			senao se (media>=5 e media<7)
			{
				escreva("\nAlune: ",nome," você ficou de exame...")
			}
			senao
			{
				escreva("\nAlune: ",nome," você foi reprovade...")
			}
			escreva("\nMedia do alune ",x," foi de: ",media)
			somaMedia = somaMedia + media
		} 
		// quanto vale x??? 5 1 6
		mediaGeral = somaMedia / (x-1)
		escreva("\nMédia geral foi de: ",mediaGeral)


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 553; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */