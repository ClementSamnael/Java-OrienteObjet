package Test;

public class Main {

	public static void main(String[] args) {

		Voiture uneVoiture = new Voiture("Twingo", 2019, 10000, "1234 az 49", 'B', true);
		Camion unCamion = new Camion("J9", 2014, 20000, "987 bcd 75", 'B', 25);
		Autocar unCar = new Autocar("FRI", 2005, 90000, "4567wx01", 'D', 3.0F, 53);

		/*
		 * Test sur une Voiture
		 */
		uneVoiture.afficherVoiture();
		uneVoiture.coutLocation();
		uneVoiture.age();

		/*
		 * Test sur un Camion
		 */
		unCamion.afficherCamion();
		unCamion.peutTransporterVolume(7.0F);
		unCamion.coutLocation();
		unCamion.age();

		/*
		 * Test sur un Autocar
		 */
		unCar.afficherCar();
		unCar.peutTransporterPassagers(40, 0.1F);
		unCar.age();
	}

}
