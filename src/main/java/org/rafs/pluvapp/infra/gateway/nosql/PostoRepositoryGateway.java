package org.rafs.pluvapp.infra.gateway.nosql;

import org.rafs.pluvapp.application.gateway.PostoGateway;
import org.rafs.pluvapp.domain.model.Posto;
import org.rafs.pluvapp.infra.gateway.Mapper.PostoMapper;
import org.rafs.pluvapp.infra.persistence.entity.nosql.PostoDocument;
import org.rafs.pluvapp.infra.tracing.TracingNoSqlService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("nosql")
public class PostoRepositoryGateway implements PostoGateway {

    private final TracingNoSqlService tracingNoSqlService;
    private final PostoMapper postoMapper;

    public PostoRepositoryGateway(TracingNoSqlService tracingNoSqlService, PostoMapper postoMapper) {
        this.tracingNoSqlService = tracingNoSqlService;
        this.postoMapper = postoMapper;
    }

    @Override
    public Posto findById(String id) {
        PostoDocument postoDocument = tracingNoSqlService.findById(id);
        return postoMapper.toPostoDomainObj(postoDocument);
    }
}
