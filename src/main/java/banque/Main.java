package banque;

public class Main {

	public static void main(String[] args) {
		LEP lep = new LEP("une", 1544454545, 1458.0f);
		System.out.println(lep.getMin());
		System.out.println(lep.getMax());

		LDD ldd = new LDD("une", 1544454545, 1458.0f);
		System.out.println(ldd.getMin() + " euros");
		System.out.println(ldd.getMax());

		CompteCourant compte = new CompteCourant("une", 1544454545, 1458.0f);
		System.out.println(compte);
		CompteCourant compte2 = new CompteCourant("une", 1544454545, 1458.0f, 69.36f);
		System.out.println(compte2);

		Societe societe = new Societe("DTA", "Rue Jacques Brel");
		System.out.println(societe);
		Particulier particulier = new Particulier("Clement", "Rue des Freres Lumieres", 1992);
		System.out.println(particulier);
	}

}
