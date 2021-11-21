package printf;

public class Printf {
	
	public static void main(String[] args) {

		// Como usar o printf

//		%s --------- String de caracteres
//		%d --------- Número inteiro decimal
//		%u --------- Número inteiro decimal sem sinal
//		%o --------- Número inteiro octal sem sinal
//		%x, %X --------- Número inteiro hexadecimal sem sinal, minúsculo ou maiúsculo
//		%f --------- Float
//		%2f	 --------- Double
//		%e, %E --------- Número real, em notação científica, minúsculo ou maiúsculo
//		%b --------- Boolean
//		%c --------- Caractere (char)
//		%n --------- Quebra de linha

		String[] product = { "Computer", "Book", "Phone" };
		int[] percent = { 40, 12, 60 };
		
		System.out.println("Usando o printf");
		for (int i = 0; i < product.length; i++) {
			System.out.printf("The %s's price has increased %d%%%n", product[i], percent[i]); //Temos que botar
			//Na ordem
		}
		
		System.out.println("\nUsando o println");
		for (int i = 0; i < product.length; i++) {
			System.out.println("The " + product[i]+ "'s price has increased " + percent[i] + "%");
		}
		
		//Duas porcentagens e pra botar uma porcentagem, basicamente igual a contrabarra ou as aspas (Que precisamos
		//Colocar uma contrabarra antes).
		
		//Como podemos ver assim fica muito mais limpo e facil de entender, mas a gente usa o printf apenas em momentos 
		//De necessidade esse nao e um desses momentos, porque usando o printf possivelmente o sistema fica mais 
		//Pesado, mas podemos fazer algumas coisas legais com ele, como mostrar apenas dois digitos, recomendo 
		//Pesquisar coisas legais que da para fazer com ele :)
		
	}
}
