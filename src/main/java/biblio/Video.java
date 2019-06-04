package biblio;

public class Video extends Document {

	public Video(String titre, String auteur, boolean empruntable, float coutDoc) {
		super(titre, auteur, empruntable, coutDoc);
	}

	/*
	 * Enum des types de vidéos
	 */
	enum Type {
		DVD, Blu_Ray, Blu_Ray_3D
	}

}
