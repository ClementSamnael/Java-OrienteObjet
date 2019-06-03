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

	public static Carte[] init() {
		Carte[] cards = new Carte[52];
		String color[] = { "Pique", "Coeur", "Trefle", "Carreau" };
		int cursor = 0;
		for (int i = 0; i < color.length; i++) {
			for (int j = 1; j <= 13; j++) {
				cards[cursor++] = new Carte(color[i], j);
			}
		}
		return cards;
	}

	public static void exchange(Carte[] cards) {
		Random random = new Random();
		int nb1 = random.nextInt(cards.length);
		int nb2 = random.nextInt(cards.length);
		Carte tmp = cards[nb1];
		cards[nb1] = cards[nb2];
		cards[nb2] = tmp;
	}

	@Override
	public String toString() {
		return this.value + " - " + this.color;
	}
}
