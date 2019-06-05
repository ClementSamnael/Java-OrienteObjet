package biblio;

public final class Video extends Document {

	// -------------------------------------------------/
	/*
	 * Constructeur
	 */
	public Video(String titre, String auteur, float coutDoc, Type type) {
		super(titre, auteur, coutDoc, type);
	}

	// ------------------MÉTHODES-------------------------------/
	@Override
	public boolean estEmpruntable() {
		return true;
	}

	@Override
	public float coutDocument() {
		return 70.0F;
	}

	@Override
	public String getTypeDocument() {
		return Type.DVD.choixType();
	}
}
