package arrayMultidimensionalDeclaracoes;

public class Test {
	public static void main(String[] args) {

		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } }; // Fica tipo uma casinha
		int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		System.out.println("Valores no array1 passados na linha são...");
		mostrarArray(array1);
		
		System.out.println("Valores no array2 passados na linha são...");
		mostrarArray(array2);
		
		System.out.println("=========Array1=========");
		System.out.println("Mostrando tudo manualmente... ");
		System.out.println(array1 [0][0]);
		System.out.println(array1 [0][1]);
		System.out.println(array1 [0][2]);
		System.out.println(array1 [1][0]);
		System.out.println(array1 [1][1]);
		System.out.println(array1 [1][2]);
		
		System.out.println("=========Array2=========");
		System.out.println("Mostrando tudo manualmente... ");
		System.out.println(array2 [0][0]);
		System.out.println(array2 [0][1]);
		System.out.println(array2 [1][0]);
		System.out.println(array2 [2][0]);
		System.out.println(array2 [2][1]);
		System.out.println(array2 [2][2]);
		
	}

	private static void mostrarArray(int[][] array) {

		// FAZ UM LOOP PELAS COLUNAS
		for (int coluna = 0; coluna < array.length; coluna++) {

			// FAZ LOOP PELAS COLUNAS DA LINHA ATUAL
			for (int linha = 0; linha < array[coluna].length; linha++) {
				
				System.out.println(array[coluna][linha]);
			}
		}
	}
}