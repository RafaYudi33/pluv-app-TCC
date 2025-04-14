package org.rafs.pluvapp.infra.gateway.mysqlwjson;

import org.rafs.pluvapp.application.gateway.PrecipitacaoGateway;
import org.rafs.pluvapp.domain.model.Precipitacao;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("mysqlwjson")
public class PrecipitacaoRepositoryGateway implements PrecipitacaoGateway {
    @Override
    public List<Precipitacao> findByPostoId(String postoId) {
        return List.of();
    }
}
