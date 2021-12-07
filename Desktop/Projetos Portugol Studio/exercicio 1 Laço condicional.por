programa
{
	
	funcao inicio()
	{

        real PesoTomates,excesso,multa

        escreva("\n Qual o peso de sua mercadoria? ")
        leia(PesoTomates)

        multa=(PesoTomates-50)*4.0
        excesso=PesoTomates-50

        se(PesoTomates>50)
        {
            escreva("\n Você está com: ", excesso," KG a mais e terá que pagar uma multa de: ",multa, "R$ por ter ultrapassado o peso permitido.")
        }
        senao se(PesoTomates>=0.0 e PesoTomates<50.0)
        {
        	multa=0.0
        	excesso=0.0
            escreva("\n Você está levando o peso permitido e não terá que pagar multa.")
            escreva("\n O valor da multa é de: ", multa, " e o peso em excesso é de: ",excesso, "KG")
        }

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 726; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */