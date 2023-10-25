package appointment.backend.sample.application.port.in;

import appointment.backend.infrastructure.persistence.entities.MyEntity;

public interface SampleUseCase {
    MyEntity createMyEntity(MyEntity entity);
}
