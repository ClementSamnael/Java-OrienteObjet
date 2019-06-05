package test;

public class Camion extends Vehicule {

	protected float volStock;

	/*
	 * Constructeur classe fille : Camion
	 */
	public Camion(String modele, int annee, float prixAchat, String numImma, char permis, float volStock) {
		super(modele, annee, prixAchat, numImma, permis);
		this.volStock = volStock;
	}

	/*
	 * Peut transporter un volume donné
	 */
	public void peutTransporterVolume(float volATransporter) {
		if (volATransporter > this.volStock) {
			System.out.println("Volume trop grand");
		} else {
			System.out.println("Volume OK");
		}
	}

	/*
	 * Affiche description camion
	 */
	public void afficherCamion() {
		String affCamion = super.toString();
		float volCamion = this.volStock;
		System.out.println(affCamion + " Volume : " + volCamion + " m³");
		affCamion = (affCamion + " - Volume : " + volCamion + " m³");
	}
}
