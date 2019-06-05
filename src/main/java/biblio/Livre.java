package biblio;

public class Livre extends DocumentPapier {

	public Livre(String titre, String auteur, boolean empruntable, float coutDocEcrit, int nbPages, Type doc) {
		super(titre, auteur, empruntable, coutDocEcrit, nbPages, doc);
	}

	// -----------------------MÉTHODES--------------------------/
	@Override
	public boolean estEmpruntable() {
		return false;
	}

	@Override
	public String getTypeDocument() {
		return Type.Livre.getTypeDoc();
	}

}
