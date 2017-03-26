package tests;

import resources.BerekenElecktriciteitImpl;

public class methodenTests {

	public static void main(String[] args) {
		BerekenElecktriciteitImpl energie = new BerekenElecktriciteitImpl();
		
		//hieronder staan 4 testcases voor het testen van de methode "BerkenPrijs" uit de klasse "BerekenElecktriciteitImpl.
		// check om te kijken of de foutmeldingen worden geconstateerd en de methode werkt.
		
		System.out.println(energie.berekenPrijs(40123, 42322, 0.5));
		System.out.println(energie.berekenPrijs(0, 24232, 0.2));
		System.out.println(energie.berekenPrijs(25232, 5421, 0));	
		System.out.println(energie.berekenPrijs(0, 0, 0));
		System.out.println(energie.berekenPrijs(-1123, -8322, -0.5));

	}

}
