package org.rafs.pluvapp.infra.gateway.relational;

import org.rafs.pluvapp.application.gateway.PostoGateway;
import org.rafs.pluvapp.domain.model.Posto;
import org.rafs.pluvapp.infra.gateway.Mapper.PostoMapper;
import org.rafs.pluvapp.infra.persistence.entity.relational.PostoEntity;
import org.rafs.pluvapp.infra.tracing.TracingRelationalService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;



@Component
@Profile("relational")
public class PostoRepositoryGateway implements PostoGateway {

    private final TracingRelationalService postoTracing;
    private final PostoMapper postoMapper;

    public PostoRepositoryGateway(TracingRelationalService postoTracing, PostoMapper postoMapper) {
        this.postoTracing = postoTracing;
        this.postoMapper = postoMapper;
    }

    @Override
    public Posto findById(String id) {
        PostoEntity postoEntity = postoTracing.traceFindById(id);
        return postoMapper.toPostoDomainObj(postoEntity);
    }


}
