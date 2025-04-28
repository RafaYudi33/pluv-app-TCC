package org.rafs.pluvapp.infra.tracing;

import com.newrelic.api.agent.Trace;
import org.rafs.pluvapp.infra.persistence.entity.postgreswjsonb.PostoEntity;
import org.rafs.pluvapp.infra.persistence.entity.postgreswjsonb.PrecipitacaoEntity;
import org.rafs.pluvapp.infra.persistence.repository.postgreswjsonb.PostoRepository;
import org.rafs.pluvapp.infra.persistence.repository.postgreswjsonb.PrecipitacaoRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("postgreswjsonb")
public class TracingPostgresWjsonbService {
    private final PostoRepository postoRepository;
    private final PrecipitacaoRepository precipitacaoRepository;

    public TracingPostgresWjsonbService(PostoRepository postoRepository, PrecipitacaoRepository precipitacaoRepository) {
        this.postoRepository = postoRepository;
        this.precipitacaoRepository = precipitacaoRepository;
    }

    @Trace(dispatcher = true, metricName = "findPostoById/postgreswjsonb")
    public PostoEntity traceFindById(String id){
        return postoRepository.findById(id).orElseThrow(()-> new RuntimeException("Posto with id " + id + " not found"));
    }

    @Trace(dispatcher = true, metricName = "findPrecipitacaoByPostoId/postgreswjsonb")
    public List<PrecipitacaoEntity> traceFindPrecipitacaoByPostoId(String postoId) {
        return precipitacaoRepository.findByPostoId(postoId);
    }
}
