package exercice;

public class Carte {
//defini par couleur et numéro de 1 à 13
	// stocker les 52 cartes dans un tableau
	// melanger les cartes
	// diviser les cartes en deux joueurs
	// class perosnne

	/** Rang de la carte. */
	public enum Rang {
		DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI, AS
	}

	/** Couleur de la carte. */
	public enum Couleur {
		PIQUE, COEUR, CARREAU, TREFLE
	}

	/** Le rang de la carte. */
	private Rang rang;

	/** La couleur de la carte. */
	private Couleur couleur;

	/*
	 * Constructeur
	 */
	public Carte(Rang rang, Couleur couleur) {
		this.rang = rang;
		this.couleur = couleur;
	}

	/*
	 * Getter
	 */
	public Rang getRang() {
		return rang;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	/*
	 * Setter
	 */
	public void setRang(Rang rang) {
		this.rang = rang;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

//	public Carte(int val, String coul) {
//		this.valeur = val;
//		this.couleur = coul;
//	}
//
//	public int getValeur() {
//		return valeur;
//	}
//
//	public void setValeur(int valeur) {
//		this.valeur = valeur;
//	}
//
//	public String getCouleur() {
//		return couleur;
//	}
//
//	public void setCouleur(String couleur) {
//		this.couleur = couleur;
//	}

}
