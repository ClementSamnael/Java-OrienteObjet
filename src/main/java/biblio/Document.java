package biblio;

public class Document {

	/*
	 * variables
	 */
	protected String titre;
	protected String auteur;
	protected boolean empruntable;
	protected float coutDocEcrit;
	final protected int CONSTANTE_COUT_VIDEO = 70;

	/*
	 * Constructeur de doc
	 */
	public Document(String titre, String auteur, boolean empruntable, float coutDocEcrit) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.empruntable = empruntable;
		this.coutDocEcrit = coutDocEcrit;
	}

	/*
	 * Getter
	 */
	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public boolean isEmpruntable() {
		return empruntable;
	}

	public float getCoutDocEcrit() {
		return coutDocEcrit;
	}

	public int getCONSTANTE_COUT_VIDEO() {
		return CONSTANTE_COUT_VIDEO;
	}

	/*
	 * Setter
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setEmpruntable(boolean empruntable) {
		this.empruntable = empruntable;
	}

	public void setCoutDocEcrit(float coutDocEcrit) {
		this.coutDocEcrit = coutDocEcrit;
	}

	/*
	 * Ajouter un Document Pas bon
	 */
	public Document ajoutDoc(Document doc) {
		return doc = new Document(titre, auteur, empruntable, coutDocEcrit);
	}
}
