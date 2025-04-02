package org.rafs.pluvapp.infra.tracing;

import com.newrelic.api.agent.Trace;
import org.rafs.pluvapp.infra.persistence.entity.nosql.PostoDocument;
import org.rafs.pluvapp.infra.persistence.repository.mongo.PostoRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("nosql")
public class TracingNoSqlService {
    private final PostoRepository postoRepository;


    public TracingNoSqlService(PostoRepository postoRepository) {
        this.postoRepository = postoRepository;
    }

    @Trace(dispatcher = true, metricName = "findPostoById/nosql")
    public PostoDocument findById(String id){
        return postoRepository.findById(id).orElseThrow(()-> new RuntimeException("Posto with id " + id + " not found"));
    }

}
