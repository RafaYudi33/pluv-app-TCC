package org.rafs.pluvapp.infra.gateway.mysqlwjson;

import org.rafs.pluvapp.application.gateway.PostoGateway;
import org.rafs.pluvapp.domain.model.Posto;
import org.rafs.pluvapp.infra.gateway.Mapper.PostoMapper;
import org.rafs.pluvapp.infra.persistence.entity.mysqlwjson.PostoEntity;
import org.rafs.pluvapp.infra.tracing.TracingMysqlWjson;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("mysqlwjson")
public class PostoRepositoryGateway implements PostoGateway {
    private final TracingMysqlWjson tracingMysqlWjson;
    private final PostoMapper postoMapper;

    public PostoRepositoryGateway(TracingMysqlWjson tracingMysqlWjson, PostoMapper postoMapper) {
        this.tracingMysqlWjson = tracingMysqlWjson;
        this.postoMapper = postoMapper;
    }

    @Override
    public Posto findById(String id) {
        PostoEntity posto = tracingMysqlWjson.traceFindById(id);
        return postoMapper.toPostoDomainObj(posto);
    }
}
