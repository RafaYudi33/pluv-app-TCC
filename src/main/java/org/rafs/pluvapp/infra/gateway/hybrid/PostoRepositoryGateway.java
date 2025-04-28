package org.rafs.pluvapp.infra.gateway.hybrid;

import org.rafs.pluvapp.application.gateway.PostoGateway;
import org.rafs.pluvapp.domain.model.Posto;
import org.rafs.pluvapp.infra.gateway.Mapper.PostoMapper;
import org.rafs.pluvapp.infra.persistence.entity.hybrid.PostoEntity;
import org.rafs.pluvapp.infra.tracing.TracingHybridService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("hybrid")
public class PostoRepositoryGateway implements PostoGateway {

    private final TracingHybridService tracingHybridService;
    private final PostoMapper postoMapper ;

    public PostoRepositoryGateway(TracingHybridService tracingHybridService, PostoMapper postoMapper) {
        this.tracingHybridService = tracingHybridService;
        this.postoMapper = postoMapper;
    }

    @Override
    public Posto findById(String id) {
        PostoEntity posto = tracingHybridService.traceFindById(id);
        return postoMapper.toPostoDomainObj(posto);
    }
}
