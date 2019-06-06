package banque;

public abstract class Compte {

	protected Proprietaire proprio;
	protected static int numeroCpt;
	protected float montant;// solde
	protected float min;// plancher
	protected float max;// plafond

	// ----------------CONSTRUCTEUR-------------------------\\
	public Compte(Proprietaire proprio, int numeroCpt, float montant) throws Exception {
		this.proprio = proprio;
		Compte.numeroCpt = numeroCpt;
		this.montant = montant;
		if (montant < 0) {
			throw new Exception("Error, impossible de créer le compte");
		}
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
		Compte.numeroCpt = numeroCpt;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	// ----------------MÉTHODES ABSTRAITES-------------------------\\
	public abstract float getMin();

	public abstract float getMax();

	public abstract float calculInterets();

	public abstract boolean comptesDecouvert();

	// ----------------MÉTHODES-------------------------\\
	/*
	 * Versement d'espèces
	 */
	public float versementEsp(float versEsp) {
		this.montant += versEsp;
		return this.montant;
	}

	/*
	 * Retirer d'espèces
	 */
	public float retrait(float retrait) {
		this.montant -= retrait;
		return this.montant;
	}

	/*
	 * Virement d'un compte à un compte
	 */
	public float virement(int cptReceveur, float retrait) {
		if (Compte.numeroCpt == cptReceveur) {
			versementEsp(cptReceveur);
		} else {
			versementEsp(cptReceveur);
			this.montant -= 1.0f;
		}
		return this.montant;
	}

	// ----------------@Override-------------------------\\
	@Override
	public String toString() {
		return ("Un compte a pour proprietaire : " + this.proprio + ", a pour numero de compte : " + Compte.numeroCpt
				+ ", pour montant : " + this.montant + "€");
	}
}
