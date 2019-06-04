package exercice;

public class Main {

	public static void main(String[] args) {

		Carte[][] cartes = Carte.init();
//		Carte[] main = Carte.mainJoueurs();
		for (int i = 0; i < 100; i++) {
			Carte.exchange(cartes);
		}
		for (int i = 0; i < cartes.length; i++) {
			System.out.println(cartes[i]);
//			System.out.println(main[i]);
		}
	}

}
