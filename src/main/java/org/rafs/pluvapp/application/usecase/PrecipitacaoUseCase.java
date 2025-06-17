package org.rafs.pluvapp.application.usecase;

import org.rafs.pluvapp.application.gateway.PrecipitacaoGateway;
import org.rafs.pluvapp.domain.model.Precipitacao;
import org.rafs.pluvapp.infra.persistence.dto.PrecipitacaoWithPostoId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrecipitacaoUseCase {

    private final PrecipitacaoGateway precipitacaoGateway;

    public PrecipitacaoUseCase(PrecipitacaoGateway precipitacaoGateway) {
        this.precipitacaoGateway = precipitacaoGateway;
    }

    public List<Precipitacao> findByPostoId(String postoId) {
        return precipitacaoGateway.findByPostoId(postoId);
    }

    public List<PrecipitacaoWithPostoId> findByPostoAno(int ano, String postoId){
        return precipitacaoGateway.findByPostoAno(ano, postoId );
    }
}
