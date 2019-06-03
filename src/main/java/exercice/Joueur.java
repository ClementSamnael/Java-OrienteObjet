package exercice;

public class Joueur {

	private String name;
	private Carte[] cards;

	public Joueur(String name, Carte[] cards) {
		this.name = name;
		this.cards = cards;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Carte[] getCards() {
		return cards;
	}

	public void setCards(Carte[] cards) {
		this.cards = cards;
	}

}
