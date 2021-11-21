package operadorTernário;

import java.util.Scanner;

public class Test {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// O Operador Ternario serve para simplificar o if else (Se só tiver 1 if e 1 else)

		// Progaminha básica de idade

		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		System.out.println(idade >= 18 ? "Pode passar" : "Não pode passar");
		
		// O ponto de interrogação significa, "se true executar..." e os dois pontos
		// significa, "se false executar..."

		// Também podemos atribuir valores a uma variavel usando o operador ternário.

		String status = idade >= 18 ? "Pode passar" : "Não pode passar";

		System.out.println(status);

		// Em if e else:

		if (idade >= 18) {
			System.out.println("Pode passar");
		} else {
			System.out.println("Não pode passar");
		}

		// Tem como usar o operador ternario para simplificar mais de um if e else, mas
		// não é recomendado

		String status2 = idade >= 18 ? idade >= 60 ? "Idoso" : "Adulto" : "Menor de Idade";
		System.out.println(status2);
		
		// Não é recomendado, porque depois de um tempo pode ficar dificil entender o
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