package exercice;

import java.util.Random;

public class Carte {

	private String color;
	private int value;

	public Carte(String color, int value) {
		this.color = color;
		this.value = value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static Carte[][] init() {
		Carte[] cards = new Carte[52];
		String color[] = { "Pique", "Coeur", "Trefle", "Carreau" };
		Carte[] hand = new Carte[26];
		Carte[][] main2Joueurs = new Carte[26][26];
		int cursor = 0;
		for (int i = 0; i < color.length; i++) {
			for (int j = 1; j <= 13; j++) {
				cards[cursor++] = new Carte(color[i], j);
				for (int k = 0; k < cards.length / 2; k++) {
					hand[k] = cards[k];
					main2Joueurs[k][i] = hand[k];
					main2Joueurs[k][i] = cards[k];
				}
			}
		}
		return main2Joueurs;
	}

	public static void exchange(Carte[][] cartes) {
		Random random = new Random();
		int nb1 = random.nextInt(cartes.length);
		int nb2 = random.nextInt(cartes.length);
		Carte[] tmp = cartes[nb1];
		cartes[nb1] = cartes[nb2];
		cartes[nb2] = tmp;
	}

	@Override
	public String toString() {
		return this.value + " - " + this.color;
	}
}
