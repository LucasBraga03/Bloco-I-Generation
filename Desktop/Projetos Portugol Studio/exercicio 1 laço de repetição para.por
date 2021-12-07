programa
{
	
	funcao inicio()
	{
		real sal, somSal=0.0, medSal, medFil, maiorSal=0.0, perc100, menor100=0.0
		inteiro filhos, somFil=0.0, x

		para(x=1;x<=4;x++)
		{
			escreva("\n Qual é o seu salário atual? ")
			leia(sal)
			escreva("\n Quantos filhos você tem? ")
			leia(filhos)

			somSal=somSal+sal
			somFil=somFil+filhos

			se(maiorSal<sal)
			{
				maiorSal=sal
			}
			se(sal<=100)
			{
				menor100++
			}
		}

		medSal=somSal/4
		medFil=somFil/4
		perc100=(menor100*100)/4

		escreva("\n A média salarial da população é de: ",medSal)
		escreva("\n A média do número de filhos é de: ", medFil)
		escreva("\n O maior salário é de: ",maiorSal)
		escreva("\n O porcentual de habitantes que recebe acima de 100 reais é de: ", perc100)
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */