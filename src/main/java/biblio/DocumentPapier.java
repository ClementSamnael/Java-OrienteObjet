package biblio;

public abstract class DocumentPapier extends Document {

	protected int nbPages;

	// -------------------------------------------------/
	/*
	 * Constructeur
	 */
	public DocumentPapier(String titre, String auteur, float coutDoc, int nbPages, Type doc) {
		super(titre, auteur, coutDoc, doc);
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
	public float coutDocument() {
		return this.coutDoc = 0.5f * nbPages;
	}

}
