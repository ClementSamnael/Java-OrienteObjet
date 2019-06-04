package exemple;

public class Chat extends Animal {
	public Chat(String nom) {
		super(nom);
		System.out.println("Un chat est instancié");
	}

	public void miaule() {
		System.out.println("Il miaule !");
	}
}
