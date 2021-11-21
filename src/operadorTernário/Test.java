package operadorTern�rio;

import java.util.Scanner;

public class Test {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// O Operador Ternario serve para simplificar o if else (Se s� tiver 1 if e 1 else)

		// Progaminha b�sica de idade

		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		System.out.println(idade >= 18 ? "Pode passar" : "N�o pode passar");
		
		// O ponto de interroga��o significa, "se true executar..." e os dois pontos
		// significa, "se false executar..."

		// Tamb�m podemos atribuir valores a uma variavel usando o operador tern�rio.

		String status = idade >= 18 ? "Pode passar" : "N�o pode passar";

		System.out.println(status);

		// Em if e else:

		if (idade >= 18) {
			System.out.println("Pode passar");
		} else {
			System.out.println("N�o pode passar");
		}

		// Tem como usar o operador ternario para simplificar mais de um if e else, mas
		// n�o � recomendado

		String status2 = idade >= 18 ? idade >= 60 ? "Idoso" : "Adulto" : "Menor de Idade";
		System.out.println(status2);
		
		// N�o � recomendado, porque depois de um tempo pode ficar dificil entender o
		// codigo que voce mesmo fez

		// Em if e else

		if (idade >= 18 && idade < 60) {
			System.out.println("Adulto");
		} else if (idade >= 60) {
			System.out.println("Idoso");
		} else {
			System.out.println("Menor de idade");
		}
	}
}