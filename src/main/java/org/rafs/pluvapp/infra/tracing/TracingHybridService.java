package org.rafs.pluvapp.infra.tracing;

import com.newrelic.api.agent.Trace;
import org.rafs.pluvapp.infra.integration.hybrid.PrecipitacaoWithPostoEntity;

import org.rafs.pluvapp.infra.persistence.entity.hybrid.PostoEntity;
import org.rafs.pluvapp.infra.persistence.entity.hybrid.PrecipitacaoDocument;
import org.rafs.pluvapp.infra.persistence.repository.hybrid.PostoRepository;
import org.rafs.pluvapp.infra.persistence.repository.hybrid.PrecipitacaoRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("hybrid")
public class TracingHybridService {
    private final PostoRepository postoRepository;
    private final PrecipitacaoRepository precipitacaoRepository;


    public TracingHybridService(PostoRepository postoRepository, PrecipitacaoRepository precipitacaoRepository) {
        this.postoRepository = postoRepository;
        this.precipitacaoRepository = precipitacaoRepository;
    }

    @Trace(dispatcher = true, metricName = "findPostoById/hybrid")
    public PostoEntity traceFindById(String id){
        return postoRepository.findById(id).orElseThrow(()-> new RuntimeException("Posto with id " + id + " not found"));
    }

    @Trace(dispatcher = true, metricName = "findPrecipitacaoByPostoId/hybrid")
    public List<PrecipitacaoWithPostoEntity> traceFindPrecipitacaoByPostoId(String id){
        List<PrecipitacaoDocument> precipitacoes = precipitacaoRepository.findByPostoId(id);

        PostoEntity posto = postoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Posto não encontrado para id: " +id));

        return precipitacoes.stream()
                .map(precipitacao -> new PrecipitacaoWithPostoEntity(
                        precipitacao.getId(),
                        precipitacao.getAno(),
                        precipitacao.getMes(),
                        precipitacao.getDados(),
                        posto
                ))
                .toList();
    }
}
