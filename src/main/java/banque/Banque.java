package banque;

import java.io.Serializable;
import java.util.ArrayList;

public final class Banque implements Serializable {

	private static final long serialVersionUID = 1L;

	private ArrayList<Proprietaire> prorietaire;
	private ArrayList<Compte> compte;

	// ----------------CONSTRUCTEUR-------------------------\\
	public Banque(ArrayList<Proprietaire> prorietaire, ArrayList<Compte> compte) {
		this.prorietaire = new ArrayList<>();
		this.compte = new ArrayList<>();
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
		for (Compte compte : this.compte) {
			compte.appliquerInterets();
		}
	}

	/*
	 * Recherche totale ou partielle d'un proprietaire
	 */
	public ArrayList<Proprietaire> rechercheProprio(String nom) {
		ArrayList<Proprietaire> recherche = new ArrayList<>();
		for (Proprietaire unProprio : this.prorietaire) {
			if (prorietaire.contains(unProprio)) {
				recherche.add(unProprio);
			}
		}
		return recherche;
	}

	/*
	 * Tous les comptes d'un proprietaires
	 */
	public ArrayList<Proprietaire> compteDUnProprio(Proprietaire proprio) {
		return nbCompte;
	}

	/*
	 * Tous les comptes à découvert
	 */
	public ArrayList<Compte> comptesDecouverts() {
		ArrayList<Compte> compteDecouvert = new ArrayList<Compte>();
		for (Compte unCompte : compte) {
			if (unCompte.getMontant() < 0) {
				compteDecouvert.add(unCompte);
			}
		}
		return compteDecouvert;
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
