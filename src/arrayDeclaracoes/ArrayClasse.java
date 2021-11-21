package arrayDeclaracoes;

import java.util.Scanner;

public class ArrayClasse {
	
	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)){
			scan.useDelimiter("\r\n");

			System.out.println("How many people do you wanna add? ");
			int peopleQuantity = scan.nextInt();

			Pessoa[] people = new Pessoa[peopleQuantity];

			for (int i = 0; i < people.length; i++) {
				System.out.println("Name: ");
				String name = scan.next();
				System.out.println("Age: ");
				int age = scan.nextInt();
				
				people[i] = new Pessoa(name, age);
			}

			System.out.println("Do you wanna see all the people you have created? \n1 - Sim\n2 - Não");
			String choice = scan.next();

			switch (choice) {
			
			case "1":
				for (Pessoa person : people) {
					System.out.println(person);
				}
				break;
				
			case "2":
				System.out.println("*Sad face*");
				break;
			
			default:
				System.out.println("Am i a joke to you?");
			}
		}
	}
}

class Pessoa {

	private String name;
	private int age;

	public Pessoa(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}

}