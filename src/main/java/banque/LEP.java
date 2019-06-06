package banque;

public class LEP extends Compte {

	private float txInteret;

	public LEP(Proprietaire proprio, int numeroCpt, float montant) throws Exception {
		super(proprio, numeroCpt, montant);
		this.txInteret = 0.015F;
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
		return 30.0f;
	}

	@Override
	public float getMax() {
		return 7700.0f;
	}

	@Override
	public float calculInterets() {
		return this.montant += (this.montant * 1.5) / 100;
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
