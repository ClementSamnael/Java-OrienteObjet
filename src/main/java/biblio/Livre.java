package biblio;

public class Livre extends DocumentPapier {

	private boolean empruntable;

	public Livre(String titre, String auteur, boolean empruntable, int nbPages) {
		super(titre, auteur, nbPages);
		this.empruntable = empruntable;

	}

	// -----------------------MÉTHODES--------------------------/
	@Override
	public boolean estEmpruntable() {
		return false;
	}
}
