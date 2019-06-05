package tp;

import java.util.Random;
import java.util.Scanner;

public class PlusOuMoins {

	public static void plusOuMoins() {
		int nbUser;
		int cpt = 0;
		Random rand = new Random();
		int nbATrouver = rand.nextInt(100 - 0 + 1) + 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez un nombre entre 0 et 100 :");
		nbUser = scanner.nextInt();
		while (nbATrouver != nbUser) {
			if (nbATrouver < nbUser) {
				System.out.println("Trop Grand");
			} else {
				System.out.println("Trop Petit");
			}
			nbUser = scanner.nextInt();
			cpt++;
		}
		System.out
				.println("Le nombre a trouver est bien : " + nbATrouver + ". Vous l'avez fait en " + cpt + " essai(s)");
		scanner.close();
	}

	public static void main(String[] args) {
		plusOuMoins();
	}
}
