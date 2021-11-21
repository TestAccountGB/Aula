package comparacaoBitBit;

import java.util.Scanner;

public class ComparacaoBitBit {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		//O que e uma comparacao bit a bit? Como voce sabe a linguagem java compila e traduz o codigo para a linguagem
		//Do computador, que e a binaria, e a binaria sao numeros de 0 e 1 que dao alguma ordem para o computador,
		//E a nossa comparacao bit a bit faz essa comparacao de cada bit de um caractere binario, e para quer eu vou usar
		//Isso? Pra quase porra nenhuma kkkkk, pra falar a verdade isso vai ser util apenas se a gente quiser se comunicar
		//Diretamente com o computador, como por exemplo, vereficar se tal bit dos bytes que estao chegando 
		//Corresponde ao esperado para que a rede funcione, mas isso ja e muita coisa de nerd kkk.
		
		//Mas vou explicar apenas passando por cima.
		
		//Para saber qual e o codigo binario de tal numero podemos usar um metodo da classe Integer

		scan.useDelimiter("\r\n");
		
		System.out.println("Escreva um numero: ");
		int numero = scan.nextInt();
		
		String codigoBinario = Integer.toBinaryString(numero);
		System.out.println(codigoBinario);
		
		//Alguns numeros podem nao ter exatamente 4 bits, porque nao e necessario mostrar os zeros da esquerda
		
		//Vou fazer uma vereficacao que precisamos que o terceiro bit de um numero precisa ser 1, e como fazemos isso?
		//Vou fazer uma representacao do que a comparacao bit a bit faz:
		
		//Codigo do numero 4 = 0100
		//Codigo do numero 5 = 0101
		
		//Comparacao com & precisa que os dois sejam true, ou seja, a gente comeca a contar pela direita
		//Primeiramente comparando o primeiro bit = 0, porque o primeiro bit do numero 5 = 1, e o 4 = 0, ou seja,
		//Para que a comparacao retorne 1, os bits precisam ser igual.
		
		//Primeiro bit = 0;
		//Segundo bit = 0;
		//Terceiro bit = 1;
		//Quarto bit = 0;
		
		//Juntando = 0100
		
		//Ou seja, essa comparacao retorna o numero 4
		
		System.out.println(4 & 5); //Ele retorna 4
		
		//Agora vou comparar se o numero digitado tem o terceiro bit = 1
		
		//Primeiro vou fazer uma mascara do que eu quero
		
		int mask = 0b0100; //Colocamos o "0b", para falar para o java que esse numero e um numero binario.
		
		System.out.println("Digite um número para ver sua codigo binario: ");
		int number = scan.nextInt();
		
		if((number & mask) == 0b0100) {//Ou seja, se a vereficacao retornar o valor da mascara que basicamente so ta 
			//Vereficando o terceiro bit, a gente vai ter a certeza que ele vai ter o terceiro bit = 1.
			
			//Podemos colocar no lugar da mascara, a expressao != 0, porque a gente so ta vereficando um bit, ou seja, se 
			//Esse bit for verdadeiro, o numero retornado vai ser maior que 0, no minimo vai ser 1.
			
			System.out.println("3th bit's value is 1");
		} else {
			System.out.println("3th bit's value isn't 1");
		}
		
		//Simbolos de comparacao bit a bit...
		
		//Basicamente sao iguais ao duplos, como o && e || em questao de retornar verdadeiro ou falso, mas na
		//Comparacao bit a bit temos o simbolo ^
		
		//& (And) - Basicamente os 2 bits tem que ser igual a 1.
		//| (Or) - Basicamente algum dos bits tem que ser igual a 1.
		//^ (Exclusive Or, tambem conhecido como XOR/EXOR/XOU/EOU) - Basicamente APENAS um dos bit tem que ser
		//Igual a 1.
		
		//Exemplos:
		
		//Comparacao &...
		//0 & 0 = 0
		//0 & 1 = 0
		//1 & 0 = 0
		//1 & 1 = 1
		
		//Comparacao |...
		//0 | 0 = 0
		//0 | 1 = 1
		//1 | 0 = 1
		//1 | 1 = 1
		
		//Comparacao ^...
		//0 ^ 0 = 0
		//0 ^ 1 = 1
		//1 ^ 0 = 1
		//1 ^ 1 = 0
		
		//Mas como eu falei, possivelmente voce NUNCA vai usar isso kkk, mas e sempre bom conhecer :D
		
	}
}
