package biblio;

public class Main {

	public static void main(String[] args) {

		Livre livre = new Livre("Java", "oracle", true, 1000);
		Video video = new Video("La vie de java", "Oracle", null);
		Periodique periodique = new Periodique("Le quotidien de Java", "Oracle", 20, 1);

		System.out.println(livre.estEmpruntable() + " - " + livre.coutDocument());
		System.out.println(video.estEmpruntable() + " - " + video.coutDocument());
		System.out.println(periodique.estEmpruntable() + " - " + periodique.coutDocument());

		Bibliotheque biblio = new Bibliotheque();
		biblio.ajoutDoc(periodique);
		biblio.ajoutDoc(video);
		biblio.ajoutDoc(livre);
		System.out.println("Nombre de DVD : " + biblio.getNbDVD());
	}

}
