package biblio;

public abstract class DocumentPapier extends Document {

	protected int nbPages;

	// -------------------------------------------------/
	/*
	 * Constructeur
	 */
	public DocumentPapier(String titre, String auteur, boolean empruntable, float coutDoc, int nbPages, Type doc) {
		super(titre, auteur, empruntable, coutDoc, doc);
		this.nbPages = nbPages;
	}

	// -------------------------------------------------/
	/*
	 * Getter
	 */
	public int getNbPages() {
		return nbPages;
	}

	// -------------------------------------------------/
	/*
	 * Setter
	 */
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	// --------------MÉTHODES-----------------------------------/
	@Override
	public float coutDocumentEcrit() {
		return this.coutDocEcrit = (float) (0.5 * nbPages);
	}

}
