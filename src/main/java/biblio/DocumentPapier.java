package biblio;

public abstract class DocumentPapier extends Document {

	protected int nbPages;

	/*
	 * Constructeur
	 */
	public DocumentPapier(String titre, String auteur, boolean empruntable, float coutDoc, int nbPages) {
		super(titre, auteur, empruntable, coutDoc);
		this.nbPages = nbPages;
	}

	/*
	 * Getter
	 */
	public int getNbPages() {
		return nbPages;
	}

	/*
	 * Setter
	 */
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	/*
	 * Calcul du coût
	 */
	public float coutDocumentEcrit() {
		super.coutDocEcrit = 0.5F * this.nbPages;
		return super.coutDocEcrit;
	}

}
