package labs;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/certificate")
public class Resource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String certificate() {
		return "Certificado válido.";
	}
}
