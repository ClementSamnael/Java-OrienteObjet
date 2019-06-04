package exemple;

public abstract class Animal {

	private String nom;

	public Animal(String nom) {
		this.nom = nom;
//		System.out.println("Un animal est instancié");
	}

	public void getType() {
		System.out.println("Je suis un animal");
	}

	public abstract void cri();

	public void test() {
		System.out.println("test");
	}

}
