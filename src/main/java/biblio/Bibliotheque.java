package biblio;

public final class Bibliotheque {

	// private ArrayList<Document> document;

	// -------------------------------------------------/
	/*
	 * Constructeur
	 */
//	public Bibliotheque(ArrayList<Document> document) {
//		this.document = new ArrayList<Document>(document);
//	}
	/*
	 * Getter
	 */
	// -------------------------------------------------/

//	public ArrayList<Document> getDocument() {
//		return document;
//	}

	// -------------------------------------------------/
	/*
	 * Setter
	 */
//	public void setDocument(ArrayList<Document> document) {
//		this.document = document;
//	}

	// ---------------MÉTHODES----------------------------------/
	/*
	 * Ajout de document
	 */
//	public void ajoutDoc(Document doc) {
//		this.document.add(doc);
//	}

//	public int nbDVD() {
//		int nbDVD = 0;
//		for (int i = 0; i < document.size(); i++) {
//			if (document.get(i).getTypeDocument().equals("DVD")) {
//				nbDVD++;
//			}
//		}
//		return nbDVD;
//	}

	// ----------------CORRECTIONS---------------------------------/
	// Correction
	private Document[] document;

	/*
	 * Construction correction
	 */
	public Bibliotheque() {
		this.document = new Document[100];
	}

	public void ajoutDoc(Document doc) {
		for (int i = 0; i < document.length; i++) {

			if (document[i] == null) {
				document[i] = doc;
				break;
			}
		}
	}

	public int getNbDVD() {
		int sum = 0;
		for (int i = 0; i < document.length; i++) {
			if (document[i] != null && document[i] instanceof Video) {
				if (((Video) document[i]).getTypeDocument().equals("DVD")) {
					sum++;
				}
			}
		}
		return sum;
	}
}
