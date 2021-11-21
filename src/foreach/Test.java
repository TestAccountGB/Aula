package foreach;

public class Test {
	public static void main(String[] args) {
		
		int[] array = new int[24];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		
		for(int top : array) { // Foreach, usado com arrays, cada casa de um array ele realiza um loop
			
			System.out.println("Realizando loop: " + top);
		}
		
		// Por exemplo, somar todos os valores dentro de um array
		
		int aux = 0;
		for(int soma : array) {
			aux += soma;
			System.out.println("loop " + soma + ": " + aux);
		}
		System.out.println(aux);
	}
}