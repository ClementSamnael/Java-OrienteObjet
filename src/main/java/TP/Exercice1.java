//Saisir un nombre n et afficher les n nombres premiers
//Saisir un nombre parfait (somme des diviseurs égales le nombre. ex : 6 = 3 + 2 +1
package TP;

import java.util.Random;

public class Exercice1 {

	public static int generateRandom(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}

	// nombre premier
	public static boolean isPremier(int premier) {
		int div = 2;
		boolean test = true;
		if (premier <= 1) {
			return false;
		}
		while ((test) && (div < premier)) {
			if (premier % 2 == 0) {
				return false;
			}
			div++;
		}
		return true;
	}

	// nombre parfait
	public static boolean isPerfect(int number) {
		int sommeDiv = 1;

		if (number < 1)
			return false;

		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				sommeDiv += i;
		}
		return number == sommeDiv;
	}

	// Palindrome
	public static boolean isPalindrome(String palindrome) {
		palindrome = palindrome.toLowerCase();
		for (int i = 0; i <= palindrome.length()/2; i++) {
			if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - (i + 1)))
				return false;
		}
		return true;
	}

	// Correction nb premier
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// System.out.println(generateRandom(0,50));
		System.out.println(isPalindrome("KAYAK"));
		System.out.println(isPalindrome("LaaL"));
		System.out.println(isPalindrome("nAwAk"));
	}

}
