package biblio;

public class Livre extends DocumentPapier {

	public Livre(String titre, String auteur, boolean empruntable, float coutDocEcrit, int nbPages) {
		super(titre, auteur, empruntable, coutDocEcrit, nbPages);
	}

}
