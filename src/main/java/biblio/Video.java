package biblio;

public class Video extends Document {

	final private int CONSTANTE_COUT_VIDEO = 70;

	// -------------------------------------------------/
	/*
	 * Constructeur
	 */
	public Video(String titre, String auteur, boolean empruntable, float coutDoc, Type doc) {
		super(titre, auteur, empruntable, coutDoc, doc);
	}

	// -------------------------------------------------/
	/*
	 * Getter
	 */

	public int getCONSTANTE_COUT_VIDEO() {
		return CONSTANTE_COUT_VIDEO;
	}

	// ------------------MÉTHODES-------------------------------/
	@Override
	public boolean estEmpruntable() {
		return this.empruntable = true;
	}

	@Override
	public float coutDocumentEcrit() {
		return this.CONSTANTE_COUT_VIDEO;
	}

	@Override
	public String getTypeDocument() {
		return Type.DVD.getTypeDoc();
	}
}
