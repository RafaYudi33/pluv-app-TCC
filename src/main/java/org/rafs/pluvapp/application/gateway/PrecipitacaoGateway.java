package org.rafs.pluvapp.application.gateway;

import org.rafs.pluvapp.domain.model.Precipitacao;
import org.rafs.pluvapp.infra.persistence.dto.PrecipitacaoWithPostoId;

import java.util.List;

public interface PrecipitacaoGateway {

    public List<Precipitacao> findByPostoId(String postoId);
    public List<PrecipitacaoWithPostoId> findByPostoAno(int ano, String postoId);

}
