package Test;

public class Camion extends Vehicule {

	/*
	 * Constructeur classe fille : Camion
	 */
	public Camion(String modele, int annee, float prixAchat, String numImma, char permis, float volStock) {
		super(modele, annee, prixAchat, numImma, permis, volStock);
	}

	/*
	 * Affiche description camion
	 */
	public void afficherCamion() {
		String affCamion = super.toString();
		System.out.println(affCamion);
	}
}
