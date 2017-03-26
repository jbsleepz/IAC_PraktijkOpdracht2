package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/berekenElecktriciteit")
public class BerekenElecktriciteitImpl {
	
	private BerekenElecktriciteit energiePrijs = new BerekenElecktriciteit();
	private String message = "";

	//http://localhost:8082/PraktijkOpdracht2_Rest/rest/berekenElecktriciteit/berekenPrijs?beginwaarde=2&eindwaarde=3&prijs=0.5
	
	@GET
	@Path("/berekenPrijs")
	@Produces(MediaType.APPLICATION_JSON)
	public String berekenPrijs(@QueryParam("beginwaarde") int beginwaarde, @QueryParam("eindwaarde") int eindwaarde, @QueryParam("prijs") double prijs) {
		double waarde = energiePrijs.berekenPrijs(beginwaarde, eindwaarde, prijs);
		if (waarde <=0 ){
			message = "De ingevoerde waardes mogen niet mingetallen of 0 zijn of de eind waarde ligt hoger dan de beginwaarde";
		} else {
			message = "De prijs die betaald moet worden voor de elecktriciteit is : €" + waarde;
		}
		return message;
	}

}