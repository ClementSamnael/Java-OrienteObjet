package banque;

public class Main {

	public static void main(String[] args) {

		// ajouter les try / catch

		Societe societe = new Societe("Celine Girard", "Rue Jacques Brel", "DTA");
		System.out.println(societe);
		Particulier particulier = new Particulier("Clement", "Rue des Freres Lumieres", 1992);
		System.out.println(particulier);

		LEP lep = new LEP(societe, 1544454545, 1458.0f);
		System.out.println(lep.getMin());
		System.out.println(lep.getMax());
		System.out.println(lep.calculInterets());
		System.out.println(lep);

		LDD ldd = new LDD(societe, 1544454545, 1458.0f);
		System.out.println(ldd.getMin() + " euros");
		System.out.println(ldd.getMax());
		System.out.println(ldd.calculInterets());

		CompteCourant compte = new CompteCourant(particulier, 1544454545, 1458.0f);
		System.out.println(compte);
		CompteCourant compte2 = new CompteCourant(particulier, 1544454545, 1458.0f, 69.36f);
		System.out.println(compte2);

		particulier.rechercheProprio("Clément");

		Banque banque = new Banque(particulier, compte);
	}

}
