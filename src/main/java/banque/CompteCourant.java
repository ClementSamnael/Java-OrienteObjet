package banque;

public class CompteCourant extends Compte {

	private float decouvert;

	// ----------------CONSTRUCTEURS-------------------------\\
	public CompteCourant(String proprio, int numeroCpt, float montant, float decouvert) {
		super(proprio, numeroCpt, montant);
		this.decouvert = decouvert;
	}

	public CompteCourant(String proprio, int numeroCpt, float montant) {
		super(proprio, numeroCpt, montant);
		this.decouvert = 0;
	}

	// -----------------GETTER------------------------\\
	public float getDecouvert() {
		return decouvert;
	}

	// ---------------SETTER--------------------------\\
	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	// -----------------@Override------------------------\\
	@Override
	public float getMin() {
		return this.min;
	}

	@Override
	public float getMax() {
		return this.min;
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
	public String toString() {
		return (super.toString() + ". Un découvert de : " + this.decouvert + " euros est autorisé");
	}
}
