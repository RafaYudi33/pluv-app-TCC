package org.rafs.pluvapp.infra.gateway.relational;

import org.rafs.pluvapp.application.gateway.PrecipitacaoGateway;
import org.rafs.pluvapp.domain.model.Precipitacao;
import org.rafs.pluvapp.infra.gateway.Mapper.PrecipitacaoMapper;
import org.rafs.pluvapp.infra.persistence.entity.relational.PrecipitacaoEntity;
import org.rafs.pluvapp.infra.tracing.TracingRelationalService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("relational")
public class PrecipitacaoRepositoryGateway implements PrecipitacaoGateway {

    private final TracingRelationalService tracingRelationalService;
    private final PrecipitacaoMapper precipitacaoMapper;

    public PrecipitacaoRepositoryGateway(TracingRelationalService tracingRelationalService, PrecipitacaoMapper precipitacaoMapper) {
        this.tracingRelationalService = tracingRelationalService;
        this.precipitacaoMapper = precipitacaoMapper;
    }

    @Override
    public List<Precipitacao> findByPostoId(String postoId) {
        List<PrecipitacaoEntity> precipitacoes = tracingRelationalService.traceFindPrecipitacaoByPostoId(postoId);
        return precipitacaoMapper.toListPrecipitacaoDomainObjFromRelational(precipitacoes);
    }
}
