package banque;

public final class CompteCourant extends Compte {

	private float decouvert;

	// ----------------CONSTRUCTEURS-------------------------\\
	public CompteCourant(Proprietaire proprio, float montant, float decouvert) throws Exception {
		super(proprio, montant);
		this.decouvert = decouvert;
		this.interet = 0;
	}

	public CompteCourant(Proprietaire proprio, float montant) throws Exception {
		this(proprio, montant, 0);
	}

	// ---------------MÉTHODES---------------------------\\
	/*
	 * Virement d'un compte à un compte en fonction du découvert du compte courant
	 */
	public float virementCC(int cptReceveur, float retrait) {
		if (retrait < this.decouvert) {
			virement(cptReceveur, retrait);
		}
		return this.montant;
	}

	/*
	 * Retrait d'espèces en fonction du découvert du compte courant
	 */
	public float retraitCC(float retrait) {
		if (retrait < this.decouvert) {
			retrait(retrait);
		}
		return this.montant;
	}

	// ----------------@Override-------------------------\\
	@Override
	public float getMin() {
		return this.decouvert;
	}

	@Override
	public float getMin() {
		return this.min;
	}

	@Override
	public float getMax() {
		return this.min;
	}

	@Override
	public String toString() {
		return (super.toString() + ". Un découvert de : " + this.decouvert + " euros est autorisé");
	}

	@Override
	public float calculInterets() {
		return 0;
	}

	@Override
	public boolean comptesDecouvert() {
		if (this.montant < this.decouvert) {
			return true;
		}
		return false;
	}
}
