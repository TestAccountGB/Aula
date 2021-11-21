package tabelaUnicode;

import javax.swing.JOptionPane;

public class Unicode {
	
	public static void main(String[] args) {
		
		//O que e a tabela unicode? E basicamente o codigo de qualquer letra/simbolo de qualquer idioma. WOW, mas como
		//Isso pode ser util em java? Caso voce queira escrever alguma mensagem, em algum idioma que seja diferente
		//Do idioma latino, como por exemplo o japones, e bom voce pegar o codigo da tabela unicode pra aquele simbolo
		//Japones, porque nao e seguro apenas copiar o simbolo e copiar dentro de uma String achando que vai funcionar,
		//Porque a IDE nao vai entender.
		
		//Mas aonde eu acho os codigos unicode? unicode-table.com
		
		//Botando em pratica...
		
		//Quando voce entrar no site voce vai ver uma tabela gigante de letras e simbolos, e pode nao ser apenas de um
		//Idioma, pode ser ate emoji, entao e por isso que quando a gente quer escrever algum simbolo diferente, USE
		//A PORRA DA TABELA UNICODE
		
		//E como voce pode ver cada simbolo tem seu codigo, como por exemplo da letra "A" (Maiusculo): U+0041
		//Mas por que tem esse U+? Para representar que ali tem que ter o codigo corresponde da linguagem que
		//Ta sendo utilizada, como assim? No java, por exemplo, usamos o \\u para representar que e um codigo unicode.
		//Entao, no lugar do U+ e so substituir pelo codigo da linguagem.
		
		//Exemplos:
		
		//Podemos botar em uma String...
		String foda = "\u0043\u0055 \u004B\u004B\u004B";
		
		//Ou em um char, que so aceita apenas um caractere. (Coloque Entre aspas simples)
		char coracao = '\u2764';
		
		System.out.println(foda + "\nCoracao: " + coracao);
		//Possivelmente o coracao nao vai estar visivel para voce, porque a IDE nao tem suporte para esses simbolos.
		//E simbolos japoneses ou chineses etc. Nao vao estar visiveis pelo mesmo motivo do coracao.
		
		//Mas podemos mostrar usando o JOptionPane, que cria uma pequena interfacizinha.
		JOptionPane.showInputDialog(foda + "\nCoracao: " + coracao);
	}
	
}
