package banque;

public class LDD extends Compte {

	private final float INTERET = 1 / 100f;

	public LDD(Propriotaire proprio, int numeroCpt, int montant) {
		super(proprio, numeroCpt, montant);
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
}
