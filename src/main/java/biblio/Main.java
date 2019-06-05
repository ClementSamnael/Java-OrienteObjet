package biblio;

public class Main {

	public static void main(String[] args) {

		Type typeDoc = Type.DVD;

		Livre livre = new Livre("Java", "oracle", true, 1000);
		Video video = new Video("La vie de java", "Oracle", typeDoc);
		Periodique periodique = new Periodique("Le quotidien de Java", "Oracle", 20, 1);

		System.out.println(livre);
		System.out.println(video);
		System.out.println(periodique);

		System.out.println("Empruntable : " + livre.estEmpruntable() + " - Prix : " + livre.coutDocument() + " euros");
		System.out.println("Empruntable : " + video.estEmpruntable() + " - Prix : " + video.coutDocument() + " euros");
		System.out.println(
				"Empruntable : " + periodique.estEmpruntable() + " - Prix : " + periodique.coutDocument() + " euros");

		Bibliotheque biblio = new Bibliotheque();
		biblio.ajoutDoc(periodique);
		biblio.ajoutDoc(video);
		biblio.ajoutDoc(livre);
		// System.out.println("Nombre de DVD : " + biblio.getnbDVD());
	}

}
