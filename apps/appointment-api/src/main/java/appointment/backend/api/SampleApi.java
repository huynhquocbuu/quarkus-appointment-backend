package appointment.backend.api;


import appointment.backend.infrastructure.persistence.entities.MyEntity;
import appointment.backend.sample.application.port.in.SampleUseCase;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Random;

@Path("/entity")
public class SampleApi {

    @Inject
    SampleUseCase useCase;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public MyEntity add() {
        Random random = new Random();
        var entity = new MyEntity("Test Add - " + random.nextInt());
        return useCase.createMyEntity(entity);
    }


}
