package org.rafs.pluvapp.infra.gateway.postgreswjsonb;

import org.rafs.pluvapp.application.gateway.PrecipitacaoGateway;
import org.rafs.pluvapp.domain.model.Precipitacao;
import org.rafs.pluvapp.infra.gateway.Mapper.PrecipitacaoMapper;
import org.rafs.pluvapp.infra.persistence.entity.postgreswjsonb.PrecipitacaoEntity;
import org.rafs.pluvapp.infra.tracing.TracingPostgresWjsonbService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("postgreswjsonb")
public class PrecipitacaoRepositoryGateway implements PrecipitacaoGateway {

    private final TracingPostgresWjsonbService tracingPostgresWjsonbService;
    private final PrecipitacaoMapper precipitacaoMapper;

    public PrecipitacaoRepositoryGateway(TracingPostgresWjsonbService tracingPostgresWjsonbService, PrecipitacaoMapper precipitacaoMapper) {
        this.tracingPostgresWjsonbService = tracingPostgresWjsonbService;
        this.precipitacaoMapper = precipitacaoMapper;
    }

    @Override
    public List<Precipitacao> findByPostoId(String postoId) {
        List<PrecipitacaoEntity> precipitacaoList = tracingPostgresWjsonbService.traceFindPrecipitacaoByPostoId(postoId);
        return precipitacaoMapper.toListPrecipitacaoDomainObjFromPostgresJsonb(precipitacaoList);
    }

}
