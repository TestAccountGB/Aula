package continue_break;

import java.util.Scanner;

public class Test {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Continue, como o proprio nome ja diz, ele vai continuar, normalmente usado em
		// laços.

		System.out.println("Digite um limite, que eu vou mostrar todos os pares possiveis sem que eles fiquem iguais: ");

		int limite = scan.nextInt();
		
		for (int i = 0; i <= limite; i++) {
			for (int j = 0; j <= limite; j++) {
				if (i == j) {
					continue;
				}
				System.out.println(i + " " + j);
			}
		}

		// Fale uma contagem e aonde quer que pare.

		System.out.println("Limite: ");

		int limite2 = scan.nextInt();

		for (int i = 0; i < limite2; i++) {
			System.out.println("Contagem:" + i);
			if (i == limite2) {
				break;
			}
		}

		// Pular numeros divisiveis por 7:

		System.out.println("Pular numeros divisiveis por 7, Limite: ");
		int limite3 = scan.nextInt();

		for (int i = 0; i <= limite3; i++) {
			if (i % 7 == 0) {
				continue;
				// System.out.println("Nun funfa"); //Da erro, porque todo codigo abaixo do
				// continue é ignorado
			}
			System.out.println(i);
		}
	}
}