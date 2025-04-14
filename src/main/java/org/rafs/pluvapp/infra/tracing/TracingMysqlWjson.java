package org.rafs.pluvapp.infra.tracing;

import com.newrelic.api.agent.Trace;
import org.rafs.pluvapp.infra.persistence.entity.mysqlwjson.PostoEntity;
import org.rafs.pluvapp.infra.persistence.repository.mysqlwjson.PostoRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("mysqlwjson")
public class TracingMysqlWjson {

    private final PostoRepository postoRepository;

    public TracingMysqlWjson(PostoRepository postoRepository) {
        this.postoRepository = postoRepository;
    }

    @Trace(dispatcher = true, metricName = "findPostoById/relational")
    public PostoEntity traceFindById(String id){
        return postoRepository.findById(id).orElseThrow(()-> new RuntimeException("Posto with id " + id + " not found"));
    }


}
