package banque;

public abstract class Compte {

	protected Proprietaire proprio;
	protected int numeroCpt;
	private static int compteur = 1;
	protected float montant;// solde
	protected float min;// plancher
	protected float max;// plafond
	protected float interet;

	// ----------------CONSTRUCTEUR-------------------------\\
	public Compte(Proprietaire proprio, float montant) throws Exception {
		this.proprio = proprio;
		this.numeroCpt = compteur++;
		this.montant = montant;
		if (montant < 0) {
			throw new Exception("Error, impossible de créer le compte");
		}
		this.proprio.getComptes().add(this);
	}

	// ----------------GETTER-------------------------\\
	public Proprietaire getProprio() {
		return this.proprio;
	}

	public int getNumeroCpt() {
		return numeroCpt;
	}

	public float getMontant() {
		return montant;
	}

	// ----------------SETTER-------------------------\\
	public void setProprio(Proprietaire proprio) {
		this.proprio = proprio;
	}

	public void setNumeroCpt(int numeroCpt) {
		this.numeroCpt = numeroCpt;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	// ----------------MÉTHODES ABSTRAITES-------------------------\\
	public abstract float getMin();

	public abstract float getMax();

	public abstract boolean comptesDecouvert();

	// ----------------MÉTHODES-------------------------\\
	/*
	 * Versement d'espèces
	 */
	public void versementEsp(float versEsp) {
		this.montant += versEsp;
	}

	/*
	 * Retirer d'espèces
	 */
	public void retrait(float retrait) throws Exception {
		if (this.montant - retrait < getMin()) {
			throw new Exception("Solde insuffisant");
		}
		this.montant -= retrait;
	}

	/*
	 * Virement d'un compte à un compte
	 */
	public void virement(Compte compte, float retrait) throws Exception {
		int taxe = 0;
		if (!this.proprio.equals(compte.getProprio())) {
			taxe = 1;
		}
		this.retrait(retrait);
		compte.versementEsp(retrait);

	}

	public void appliquerInterets() {
		this.montant += 1 + this.interet;
	}

	// ----------------@Override-------------------------\\
	@Override
	public String toString() {
		return ("Un compte a pour proprietaire : " + this.proprio + ", a pour numero de compte : " + this.numeroCpt
				+ ", pour montant : " + this.montant + "€");
	}
}
