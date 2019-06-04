package exemple;

public class Chien extends Animal {

	public Chien(String nom) {
		super(nom);
		System.out.println("Un chien est instancié");
	}

	public void aboie() {
		System.out.println("Il aboit !");
	}
}
