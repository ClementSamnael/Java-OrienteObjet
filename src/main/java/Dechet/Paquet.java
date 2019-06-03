package Dechet;

import java.util.Random;

import exercice.Carte;
import exercice.Carte.Couleur;
import exercice.Carte.Rang;

public class Paquet {

	private Carte cartes[];

	/*
	 * Constructeur
	 */
	public Paquet() {
		this.cartes = new Carte[Rang.values().length * Couleur.values().length];
		for (int i = 0; i < Couleur.values().length; i++) {
			for (int j = 0; j < Rang.values().length; j++) {
				this.cartes[i * Rang.values().length + j] = new Carte(Rang.values()[j], Couleur.values()[i]);
			}
		}
		melanger();
	}

	/**
	 * <p>
	 * Mélange les cartes du paquet.
	 * </p>
	 */
	private void melanger() {
		Random r = new Random();
		for (int j = 0; j < this.cartes.length; j++) {
			echanger(r.nextInt(this.cartes.length), r.nextInt(this.cartes.length));
		}
	}

	/**
	 * <p>
	 * Echange deux cartes d'un paquet.
	 * </p>
	 * 
	 * @param i L'indice de la première carte à échanger.
	 * @param j L'indice de la seconde carte à échanger.
	 */
	private void echanger(int i, int j) {
		Carte temp;
		temp = this.cartes[i];
		this.cartes[i] = this.cartes[j];
		this.cartes[j] = temp;
	}

}
