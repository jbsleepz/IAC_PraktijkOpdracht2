package resources;

public class BerekenElecktriciteit {

	public double berekenPrijs(int beginwaarde, int eindwaarde, double prijs) {
		double waarde = 0;
		if (beginwaarde >= 0 || eindwaarde > 0 ||beginwaarde < eindwaarde || prijs > 0) {
			waarde = ((eindwaarde - beginwaarde) * prijs);
		}
		return waarde;
	}

}
