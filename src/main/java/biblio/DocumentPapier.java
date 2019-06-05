package biblio;

public abstract class DocumentPapier extends Document {

	protected int nbPages;

	// -------------------------------------------------/
	/*
	 * Constructeur
	 */
	public DocumentPapier(String titre, String auteur, int nbPages) {
		super(titre, auteur);
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

	@Override
	public String toString() {
		return super.toString() + " - " + " Nombre de pages : " + this.nbPages;
	}

}
