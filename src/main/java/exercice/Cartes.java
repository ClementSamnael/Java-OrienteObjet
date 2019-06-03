package exercice;

public class Cartes {
//defini par couleur et numéro de 1 à 13
	// stocker les 52 cartes dans un tableau
	// class perosnne

	private int valeur;
	private String couleur;

	public Cartes(int valeur, String couleur) {
		this.valeur = valeur;
		this.couleur = couleur;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return valeur + " de " + this.couleur;
	}

}
