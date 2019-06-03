package exercice;

import java.util.ArrayList;

public class JeuDeCarte {

	private int valeurs[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
	private String couleurs[] = { "Pique", "Coeur", "Trefle", "Carreau" };
	private int jeu[][];
	private ArrayList<Carte> paquet;

	public JeuDeCarte() {
		paquet = new ArrayList<Carte>();
	}

	public void melangerJeu() {
		ArrayList<Carte> jeuMelange = new ArrayList<Carte>();
		int n;
		while (!this.paquet.isEmpty()) {
			n = (int) (Math.random() * this.paquet.size());
			jeuMelange.add(this.paquet.remove(n));
		}
		this.paquet = jeuMelange;
	}
}
