package exemple;

public class Personne {

	private String name;

	public static int nbInstance = 0;

	public Personne(String name) {
		this.name = name;
	}

	// Constructeur par défaut (implicite) sans paramètre
	public Personne() {
		nbInstance++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toUpperCase();
	}

	// Personne p => paramètre donc this.comparer(paramètre)
//	public void comparer(Personne p) {
//		if (p.name.equals(this.name)) {
//			System.out.println("Homonyme !");
//		} else {
//			System.out.println("Différent !");
//		}
//	}
}
