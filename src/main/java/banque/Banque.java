package banque;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Banque implements Serializable {

	private static final long serialVersionUID = 1L;

	private ArrayList<Proprietaire> prorietaire;
	private ArrayList<Compte> compte;
	private Scanner scanner;

	// ----------------CONSTRUCTEUR-------------------------\\
	public Banque(ArrayList<Proprietaire> prorietaire, ArrayList<Compte> compte) {
		this.prorietaire = new ArrayList<Proprietaire>(prorietaire);
		this.compte = new ArrayList<Compte>(compte);
	}

	// -----------------GETTER------------------------\\
	public ArrayList<Proprietaire> getProrietaire() {
		return prorietaire;
	}

	public ArrayList<Compte> getCompte() {
		return compte;
	}

	// ---------------SETTER--------------------------\\
	public void setProrietaire(ArrayList<Proprietaire> prorietaire) {
		this.prorietaire = prorietaire;
	}

	public void setCompte(ArrayList<Compte> compte) {
		this.compte = compte;
	}

	// ----------------MÉTHODES-------------------------\\
	/*
	 * Appilcation des intérets (pour LDD et LEP) Ajoute les intérets au compte
	 */
	public void appliquerInterets() {
		for (int i = 0; i < compte.size(); i++) {
			compte.get(i).calculInterets();
		}
	}

	/*
	 * Recherche totale ou partielle d'un proprietaire
	 */
	public void rechercheProprio() {
		scanner = new Scanner(System.in);
		System.out.println("Saisissez un proprietaire : ");
		String scP = scanner.nextLine();
		if (prorietaire.contains(scP)) {
			System.out.println("Le proprietaire " + scP + " est présent");
		}
		System.out.println("Le proprietaire" + scP + " est inconnu");
		scanner.close();
	}

	/*
	 * Tous les comptes d'un proprietaires
	 */
	public int compteDUnProprio(Proprietaire proprio) {
		int nbCompte = 0;
		for (int i = 0; i < compte.size(); i++) {
			if (compte.get(i).getProprio().equals(proprio)) {
				nbCompte++;
			}
		}
		return nbCompte;
	}

	/*
	 * Tous les comptes à découvert
	 */
	public void comptesDecouverts() {
		for (int i = 0; i < compte.size(); i++) {
			if (compte.get(i).comptesDecouvert()) {
				System.out.println(compte.get(i));
			}
		}
	}

	/*
	 * somme des comptes d'un proprietaire
	 */
	public float sommeCompte(Proprietaire proprio) {
		int sum = 0;
		for (int i = 0; i < compte.size(); i++) {
			if (compte.get(i).getProprio().equals(proprio)) {
				sum += compte.get(i).getMontant();
			}
		}
		return sum;
	}

	/*
	 * Sauvegarder dans un fichier
	 */
	public void saveBank() {

	}
}
