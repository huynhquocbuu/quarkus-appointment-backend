package appointment.backend.sample.adapters;

import appointment.backend.infrastructure.persistence.entities.MyEntity;
import appointment.backend.infrastructure.persistence.repositories.MyEntityRepository;
import appointment.backend.sample.application.port.out.SamplePersistencePort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class SamplePersistenceAdapter implements SamplePersistencePort {
    @Inject
    MyEntityRepository repository;
    @Override
    public MyEntity insertMyEntity(MyEntity entity) {
        return repository.add(entity);
    }
}
