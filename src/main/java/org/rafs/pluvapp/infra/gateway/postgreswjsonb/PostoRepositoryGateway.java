package org.rafs.pluvapp.infra.gateway.postgreswjsonb;

import org.rafs.pluvapp.application.gateway.PostoGateway;
import org.rafs.pluvapp.domain.model.Posto;
import org.rafs.pluvapp.infra.gateway.Mapper.PostoMapper;
import org.rafs.pluvapp.infra.persistence.entity.postgreswjsonb.PostoEntity;
import org.rafs.pluvapp.infra.tracing.TracingPostgresWjsonbService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("postgreswjsonb")
public class PostoRepositoryGateway implements PostoGateway {
    private final TracingPostgresWjsonbService tracingPostgresWjsonbService;
    private final PostoMapper postoMapper;

    public PostoRepositoryGateway(TracingPostgresWjsonbService tracingPostgresWjsonbService, PostoMapper postoMapper) {
        this.tracingPostgresWjsonbService = tracingPostgresWjsonbService;
        this.postoMapper = postoMapper;
    }

    @Override
    public Posto findById(String id) {
        PostoEntity posto = tracingPostgresWjsonbService.traceFindById(id);
        return postoMapper.toPostoDomainObj(posto);
    }
}
