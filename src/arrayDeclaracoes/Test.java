package arrayDeclaracoes;

import java.util.Scanner;

public class Test {
	
	private static Scanner scan = new Scanner(System.in);
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int[] array1 = new int[4]; //Instanciando com 4 de tamanho logo no inicio
		
		//Instanciando um array depois
		int[] array2;
		array2 = new int[10];
		
		
		// Instanciando varios Arrays
		int[] array3 = new int[44], array4 = new int[23];

		// Instanciando sem falar seu tamanho
		int[] array5 = { 12, 32, 54, 6, 8, 89, 64, 64, 6 };

		int[] array6 = new int[10];
		
		array6[0] = 100;
		array6[1] = 85;
		array6[2] = 88;
		array6[3] = 93;
		array6[4] = 123;
		array6[5] = 952;
		array6[6] = 344;
		array6[7] = 233;
		array6[8] = 622;
		array6[9] = 8522;
		// array6 [10] = 564; // Não existe indice 10, porque comeca do 0

		System.out.println(array6[9]);
		System.out.println(array6[2]);
		
		// Escolhendo tamanho do array
		
		int[] array7 = new int[scan.nextInt()];
	}
}