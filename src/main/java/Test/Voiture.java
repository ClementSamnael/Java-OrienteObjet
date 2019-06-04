package Test;

public class Voiture extends Vehicule {

	private boolean radio;// radio disponible ou non

	/*
	 * Constructeur classe fille : Voiture
	 */
	public Voiture(String modele, int annee, float prixAchat, String numImma, char permis, boolean radio) {
		super(modele, annee, prixAchat, numImma, permis);
		this.radio = radio;
	}

	/*
	 * Getter
	 */
	public boolean isRadio() {
		return radio;
	}

	/*
	 * Setter
	 */
	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	/*
	 * Ajout d'un auto
	 */
	public void ajouterAutoradio() {
		this.radio = true;
	}

	/*
	 * Enlevé d'un auto
	 */
	public void enleverAutoradio() {
		this.radio = false;
	}

	/*
	 * Afficher description voiture
	 */
	public void afficherVoiture() {
		String affVoit = super.toString();
		boolean afficheRadio = this.radio;
		System.out.println(affVoit + " - Autoradio : " + afficheRadio);
	}
}
