package Test;

public class Vehicule {

	private final int ANNEE_COURANTE = 2019;
	protected String modele;
	protected int annee;
	protected float prixAchat;
	protected String numImma;
	protected char permis;
	protected float volStock;
	private int age;

	/*
	 * Constructeur classe mère
	 */
	public Vehicule(String modele, int annee, float prixAchat, String numImma, char permis, float volStock) {
		this.modele = modele;
		this.annee = annee;
		this.prixAchat = prixAchat;
		this.numImma = numImma;
		this.permis = permis;
		this.volStock = volStock;
	}

	public Vehicule(String modele, int annee, float prixAchat, String numImma, char permis) {
		this.modele = modele;
		this.annee = annee;
		this.prixAchat = prixAchat;
		this.numImma = numImma;
		this.permis = permis;
	}

	/*
	 * Getter
	 */
	public String getModele() {
		return modele;
	}

	public int getAnnee() {
		return annee;
	}

	public float getPrixAchat() {
		return prixAchat;
	}

	public String getNumImma() {
		return numImma;
	}

	public char getPermis() {
		return permis;
	}

	public float getVolStock() {
		return volStock;
	}

	/*
	 * Setter
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}

	public void setNumImma(String numImma) {
		this.numImma = numImma;
	}

	public void setPermis(char parmis) {
		this.permis = parmis;
	}

	public void setVolStock(float volStock) {
		this.volStock = volStock;
	}

	/*
	 * Affiche l'âge du véhicule
	 */
	public void age() {
		int age = this.ANNEE_COURANTE - this.annee;
		System.out.println(age + " ans");
	}

	@Override
	public String toString() {
		return this.modele + " - " + this.annee + " - " + this.prixAchat + "€ - " + this.numImma + " - " + this.permis
				+ " - " + this.volStock + "m³";
	}

	/*
	 * Affiche la description du véhicule
	 */
	public void afficherVehicule() {
		System.out.println(toString());
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
	 * calcule le coût quotidien de location d'un véhicule en fonction de l'âge de
	 * celui-ci
	 */
	public void coutLocation() {
		float coutLocation;
		if (this.age < 1) {
			coutLocation = this.prixAchat / 200.0F;
		} else {
			coutLocation = this.prixAchat / 250.0F;
		}
		System.out.println(coutLocation + "€");
	}
}
