package org.rafs.pluvapp.infra.gateway.nosql;

import org.rafs.pluvapp.application.gateway.PrecipitacaoGateway;
import org.rafs.pluvapp.domain.model.Precipitacao;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("nosql")
public class PrecipitacaoRepositoryGateway implements PrecipitacaoGateway {

    @Override
    public List<Precipitacao> findByPostoId(String postoId) {
        System.out.println("teste");
        return List.of();
    }
}
