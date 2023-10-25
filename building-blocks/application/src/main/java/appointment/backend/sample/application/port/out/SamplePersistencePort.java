package appointment.backend.sample.application.port.out;

import appointment.backend.infrastructure.persistence.entities.MyEntity;

public interface SamplePersistencePort {
    MyEntity insertMyEntity(MyEntity entity);
}
