package org.rafs.pluvapp.infra.tracing;

import com.newrelic.api.agent.Trace;
import org.rafs.pluvapp.infra.integration.nosql.PrecipitacaoWithPostoDocument;
import org.rafs.pluvapp.infra.persistence.dto.PrecipitacaoWithPostoId;
import org.rafs.pluvapp.infra.persistence.entity.nosql.PostoDocument;
import org.rafs.pluvapp.infra.persistence.entity.hybrid.PrecipitacaoDocument;
import org.rafs.pluvapp.infra.persistence.repository.nosql.PostoRepository;
import org.rafs.pluvapp.infra.persistence.repository.nosql.PrecipitacaoRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("nosql")
public class TracingNoSqlService {
    private final PostoRepository postoRepository;
    private final PrecipitacaoRepository precipitacaoRepository;


    public TracingNoSqlService(PostoRepository postoRepository, PrecipitacaoRepository precipitacaoRepository) {
        this.postoRepository = postoRepository;
        this.precipitacaoRepository = precipitacaoRepository;
    }

    @Trace(dispatcher = true, metricName = "findPostoById/nosql")
    public PostoDocument traceFindById(String id){
        return postoRepository.findById(id).orElseThrow(()-> new RuntimeException("Posto with id " + id + " not found"));
    }

    @Trace(dispatcher = true, metricName = "findPrecipitacaoByPostoId/nosql")
    public List<PrecipitacaoWithPostoDocument> traceFindPrecipitacaoByPostoId(String id){
        List<PrecipitacaoDocument> precipitacoes = precipitacaoRepository.findByPostoId(id);

        PostoDocument posto = postoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Posto não encontrado para id: " +id));

        return precipitacoes.stream()
                .map(precipitacao -> new PrecipitacaoWithPostoDocument(
                        precipitacao.getId(),
                        precipitacao.getAno(),
                        precipitacao.getMes(),
                        precipitacao.getDados(),
                        posto
                ))
                .toList();
    }

    @Trace(dispatcher = true, metricName = "findPrecipitacaoByPostoAno/nosql")
    public List<PrecipitacaoWithPostoId> traceFindPrecipitacaoByPostoAno(int ano, String postoId) {
       return precipitacaoRepository.findByPostoAno(ano, postoId);
    }
}
