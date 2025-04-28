package org.rafs.pluvapp.infra.gateway.hybrid;

import org.rafs.pluvapp.application.gateway.PrecipitacaoGateway;
import org.rafs.pluvapp.domain.model.Precipitacao;
import org.rafs.pluvapp.infra.gateway.Mapper.PrecipitacaoMapper;
import org.rafs.pluvapp.infra.integration.hybrid.PrecipitacaoWithPostoEntity;
import org.rafs.pluvapp.infra.tracing.TracingHybridService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("hybrid")
public class PrecipitacaoRepositoryGateway implements PrecipitacaoGateway {

    private final TracingHybridService tracingHybridService;
    private final PrecipitacaoMapper precipitacaoMapper;

    public PrecipitacaoRepositoryGateway(TracingHybridService tracingHybridService, PrecipitacaoMapper precipitacaoMapper) {
        this.tracingHybridService = tracingHybridService;
        this.precipitacaoMapper = precipitacaoMapper;
    }

    @Override
    public List<Precipitacao> findByPostoId(String postoId) {
        List<PrecipitacaoWithPostoEntity> precipitacaoWithPostoList = tracingHybridService.traceFindPrecipitacaoByPostoId(postoId);
        return precipitacaoMapper.toListPrecipitacaoDomainObjFromHybridIntegrationObj(precipitacaoWithPostoList);
    }
}
