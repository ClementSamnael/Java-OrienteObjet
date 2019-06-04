package Test;

public class Autocar extends Vehicule {

	private int nbPass; // nombre de passager

	/*
	 * Constructeur classe fille : Autocar
	 */
	public Autocar(String modele, int annee, float prixAchat, String numImma, char permis, float volStock, int nbPass) {
		super(modele, annee, prixAchat, numImma, permis, volStock);
		this.nbPass = nbPass;
	}

	/*
	 * Getter
	 */
	public int getNbPass() {
		return nbPass;
	}

	/*
	 * Setter
	 */
	public void setNbPass(int nbPass) {
		this.nbPass = nbPass;
	}

	/*
	 * Peut transporter un nombre de passagers
	 */
	public void peutTransporterPassagers(int nbPassagers, float volBaggages) {
		if (nbPassagers > this.nbPass && super.volStock < volBaggages) {
			System.out.println("Problème de taille");
		} else {
			System.out.println("Nombre de passagers et de baggages OK");
		}
	}

	/*
	 * Affiche description autocars
	 */
	public void afficherCar() {
		String affCar = super.toString();
		int nbPassager = this.nbPass;
		System.out.println(affCar + " - nombre de passagers : " + nbPassager);
	}
}
