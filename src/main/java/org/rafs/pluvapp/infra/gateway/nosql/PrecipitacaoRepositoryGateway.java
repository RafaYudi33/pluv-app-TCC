package org.rafs.pluvapp.infra.gateway.nosql;

import org.rafs.pluvapp.application.gateway.PrecipitacaoGateway;
import org.rafs.pluvapp.domain.model.Precipitacao;
import org.rafs.pluvapp.infra.integration.nosql.PrecipitacaoWithPostoDocument;
import org.rafs.pluvapp.infra.gateway.Mapper.PrecipitacaoMapper;
import org.rafs.pluvapp.infra.persistence.dto.PrecipitacaoWithPostoId;
import org.rafs.pluvapp.infra.tracing.TracingNoSqlService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("nosql")
public class PrecipitacaoRepositoryGateway implements PrecipitacaoGateway {

    private final TracingNoSqlService tracingNoSqlService;
    private final PrecipitacaoMapper precipitacaoMapper;

    public PrecipitacaoRepositoryGateway(TracingNoSqlService tracingNoSqlService, PrecipitacaoMapper precipitacaoMapper) {
        this.tracingNoSqlService = tracingNoSqlService;
        this.precipitacaoMapper = precipitacaoMapper;
    }

    @Override
    public List<Precipitacao> findByPostoId(String postoId) {
        List<PrecipitacaoWithPostoDocument> precipitacaoDocumentList = tracingNoSqlService.traceFindPrecipitacaoByPostoId(postoId);
        return precipitacaoMapper.toListPrecipitacaoDomainObjFromNosqlIntegrationObj(precipitacaoDocumentList);
    }

    @Override
    public List<PrecipitacaoWithPostoId> findByPostoAno(int ano, String postoId) {
       return tracingNoSqlService.traceFindPrecipitacaoByPostoAno(ano, postoId);
    }
}
