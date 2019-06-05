package biblio;

public class Livre extends DocumentPapier {

	private boolean empruntable;

	public Livre(String titre, String auteur, boolean empruntable, int nbPages) {
		super(titre, auteur, nbPages);
		this.empruntable = empruntable;

	}
	// -----------------------GETTER--------------------------/

	public boolean isEmpruntable() {
		return empruntable;
	}

	// -----------------------@Override--------------------------/
	@Override
	public String toString() {
		return super.toString() + " - " + this.empruntable;
	}

	@Override
	public boolean estEmpruntable() {
		return false;
	}

}
