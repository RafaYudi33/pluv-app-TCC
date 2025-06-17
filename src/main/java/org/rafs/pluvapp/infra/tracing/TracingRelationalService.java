package org.rafs.pluvapp.infra.tracing;

import com.newrelic.api.agent.Trace;
import org.rafs.pluvapp.infra.persistence.dto.PrecipitacaoWithPostoId;
import org.rafs.pluvapp.infra.persistence.entity.relational.PostoEntity;
import org.rafs.pluvapp.infra.persistence.entity.relational.PrecipitacaoEntity;
import org.rafs.pluvapp.infra.persistence.repository.relational.PostoRepository;
import org.rafs.pluvapp.infra.persistence.repository.relational.PrecipitacaoRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("relational")
public class TracingRelationalService {

    private final PostoRepository postoRepository;
    private final PrecipitacaoRepository precipitacaoRepository;

    public TracingRelationalService(PostoRepository postoRepository, PrecipitacaoRepository precipitacaoRepository) {
        this.postoRepository = postoRepository;
        this.precipitacaoRepository = precipitacaoRepository;
    }

    @Trace(dispatcher = true, metricName = "findPostoById/relational")
    public PostoEntity traceFindById(String id){
        return postoRepository.findById(id).orElseThrow(()-> new RuntimeException("Posto with id " + id + " not found"));
    }

    @Trace(dispatcher = true, metricName = "findPrecipitacaoByPostoId/relational")
    public List<PrecipitacaoEntity> traceFindPrecipitacaoByPostoId(String postoId){
        return precipitacaoRepository.findByPostoId(postoId);
    }

    @Trace(dispatcher = true, metricName = "findPrecipitacaoByPostoAno/relational")
    public List<PrecipitacaoWithPostoId> traceFindPrecipitacaoByAno(int ano, String postoId) {
        return precipitacaoRepository.findByPostoAno(ano, postoId);
    }
}
