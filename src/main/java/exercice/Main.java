package exercice;

public class Main {

	public static void main(String[] args) {

		Carte[] cartes = Carte.init();
		for (int i = 0; i < 100; i++) {
			Carte.exchange(cartes);
		}
		for (int i = 0; i < cartes.length; i++) {
			System.out.println(cartes[i]);
		}
	}

}
