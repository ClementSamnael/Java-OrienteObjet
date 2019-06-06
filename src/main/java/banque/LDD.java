package banque;

public class LDD extends Compte {

	private float txInteret;

	public LDD(Proprietaire proprio, int numeroCpt, float montant) throws Exception {
		super(proprio, numeroCpt, montant);
		this.txInteret = 0.01F;
	}

	// -----------------GETTER------------------------\\
	public float getTxInteret() {
		return txInteret;
	}

	// ---------------SETTER--------------------------\\
	public void setTxInteret(float txInteret) {
		this.txInteret = txInteret;
	}

	// -----------------@Override------------------------\\
	@Override
	public float getMin() {
		return 15.0f;
	}

	@Override
	public float getMax() {
		return 12000.0f;
	}

	@Override
	public float calculInterets() {
		return this.montant += (this.montant * 1) / 100;
	}

	@Override
	public String toString() {
		return super.toString() + ". Le taux d'intérêts est de : " + this.txInteret + "%";
	}

	@Override
	public boolean comptesDecouvert() {
		return false;
	}
}
