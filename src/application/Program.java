package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensionato;

public class Program {
	
	/*
	 * Programa pra ler os quartos disponiveis e perguntando ao usuario qual quarto
	 * que deseja alugar. Obtendo o nome e email do usuário e em seguida perguntar
	 * se deseja alugar mais um quarto, mostrando os quartos disponíveis novamente.
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Pensionato[] vect = new Pensionato[11]; // coloquei 10 quartos

		char resp = 'y';

		do {
			System.out.println("Rooms available:");
			for (int i = 1; i < vect.length; i++) {
				if (vect[i] == null)
					System.out.println("room available Nº " + i);
			}

			System.out.println("Which room do you want to rent?");
			int n = sc.nextInt();
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();

			vect[n] = new Pensionato(name, email);

			System.out.println("Room " + n + " successfully rented.");
			System.out.println("Do you want to rent another room?");
			resp = sc.next().charAt(0);
		} while (resp == 'y');

		System.out.println("Have a nice day.");
		sc.close();

	}

}
