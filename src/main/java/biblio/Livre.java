package biblio;

public class Livre extends DocumentPapier {

	private boolean empruntable;

	public Livre(String titre, String auteur, boolean empruntable, float coutDocEcrit, int nbPages, Type doc) {
		super(titre, auteur, coutDocEcrit, nbPages, doc);
		this.empruntable = empruntable;

	}

	// -----------------------MÉTHODES--------------------------/
	@Override
	public boolean estEmpruntable() {
		return false;
	}

	@Override
	public String getTypeDocument() {
		return Type.Livre.choixType();
	}

}
