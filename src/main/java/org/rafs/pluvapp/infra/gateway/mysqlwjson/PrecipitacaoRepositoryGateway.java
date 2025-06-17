package org.rafs.pluvapp.infra.gateway.mysqlwjson;

import org.rafs.pluvapp.application.gateway.PrecipitacaoGateway;
import org.rafs.pluvapp.domain.model.Precipitacao;
import org.rafs.pluvapp.infra.gateway.Mapper.PrecipitacaoMapper;
import org.rafs.pluvapp.infra.persistence.dto.PrecipitacaoWithPostoId;
import org.rafs.pluvapp.infra.persistence.entity.mysqlwjson.PrecipitacaoEntity;
import org.rafs.pluvapp.infra.tracing.TracingMysqlWjsonService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("mysqlwjson")
public class PrecipitacaoRepositoryGateway implements PrecipitacaoGateway {

    private final TracingMysqlWjsonService tracingMysqlWjsonService;
    private final PrecipitacaoMapper precipitacaoMapper;

    public PrecipitacaoRepositoryGateway(TracingMysqlWjsonService tracingMysqlWjsonService, PrecipitacaoMapper precipitacaoMapper) {
        this.tracingMysqlWjsonService = tracingMysqlWjsonService;
        this.precipitacaoMapper = precipitacaoMapper;
    }

    @Override
    public List<Precipitacao> findByPostoId(String postoId) {
        List<PrecipitacaoEntity> precipList = tracingMysqlWjsonService.traceFindPrecipitacaoByPostoId(postoId);
        return precipitacaoMapper.toListPrecipitacaoDomainObjFromMysqlJson(precipList);
    }

    @Override
    public List<PrecipitacaoWithPostoId> findByPostoAno(int ano, String postoId) {
        return List.of();
    }
}
