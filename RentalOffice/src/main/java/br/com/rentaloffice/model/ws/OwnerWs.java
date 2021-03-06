package br.com.rentaloffice.model.ws;

import br.com.rentaloffice.model.entities.Owner;
import br.com.rentaloffice.model.service.RentalService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 *
 * @author Arthur Gregorio
 *
 * @version 1.0.0
 * @since 1.0.0, 10/03/2017
 */
@Path("/owners")
public class OwnerWs {

    @Inject
    private RentalService rentalService;
    
    /**
     * 
     * @return 
     */
    @GET
    @Produces(APPLICATION_JSON)
    public List<Owner> listCars() {
        return this.rentalService.listAllOwners();
    }
}
