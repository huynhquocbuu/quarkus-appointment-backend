package appointment.backend.sample.application.service;

import appointment.backend.infrastructure.persistence.entities.MyEntity;
import appointment.backend.sample.application.port.in.SampleUseCase;
import appointment.backend.sample.application.port.out.SamplePersistencePort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SampleService implements SampleUseCase {
    @Inject SamplePersistencePort persistencePort;
    @Override
    public MyEntity createMyEntity(MyEntity entity) {
        return persistencePort.insertMyEntity(entity);
    }
}
