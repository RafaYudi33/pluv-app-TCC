package org.rafs.pluvapp.infra.tracing;

import com.newrelic.api.agent.Trace;
import org.rafs.pluvapp.infra.persistence.entity.mysqlwjson.PostoEntity;
import org.rafs.pluvapp.infra.persistence.entity.mysqlwjson.PrecipitacaoEntity;
import org.rafs.pluvapp.infra.persistence.repository.mysqlwjson.PostoRepository;
import org.rafs.pluvapp.infra.persistence.repository.mysqlwjson.PrecipitacaoRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("mysqlwjson")
public class TracingMysqlWjsonService {

    private final PostoRepository postoRepository;
    private final PrecipitacaoRepository precipitacaoRepository;

    public TracingMysqlWjsonService(PostoRepository postoRepository, PrecipitacaoRepository precipitacaoRepository) {
        this.postoRepository = postoRepository;
        this.precipitacaoRepository = precipitacaoRepository;
    }

    @Trace(dispatcher = true, metricName = "findPostoById/mysqlwjson")
    public PostoEntity traceFindById(String id){
        return postoRepository.findById(id).orElseThrow(()-> new RuntimeException("Posto with id " + id + " not found"));
    }

    @Trace(dispatcher = true, metricName = "findPrecipitacaoByPostoId/mysqlwjson")
    public List<PrecipitacaoEntity> traceFindPrecipitacaoByPostoId(String postoId) {
        return precipitacaoRepository.findByPostoId(postoId);
    }
}
