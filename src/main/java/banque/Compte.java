package banque;

public abstract class Compte {

	protected Propriotaire proprio;
	protected int numeroCpt;
	protected float montant;
	protected float min;
	protected float max;

	// ----------------CONSTRUCTEUR-------------------------\\
	public Compte(Propriotaire proprio, int numeroCpt, float montant) {
		this.proprio = proprio;
		this.numeroCpt = numeroCpt;
		this.montant = montant;
	}

	// ----------------GETTER-------------------------\\
	public Propriotaire getProprio() {
		return proprio;
	}

	public int getNumeroCpt() {
		return numeroCpt;
	}

	public float getMontant() {
		return montant;
	}

	// ----------------SETTER-------------------------\\
	public void setProprio(Propriotaire proprio) {
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
		if (this.numeroCpt == cptReceveur) {
			versementEsp(cptReceveur);
		} else {
			versementEsp(cptReceveur);
			this.montant = this.montant - 1.0f;
		}
		return this.montant;
	}
}
