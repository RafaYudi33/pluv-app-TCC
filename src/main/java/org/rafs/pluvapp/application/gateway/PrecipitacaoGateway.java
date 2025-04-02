package org.rafs.pluvapp.application.gateway;

import org.rafs.pluvapp.domain.model.Precipitacao;

import java.util.List;

public interface PrecipitacaoGateway {

    public List<Precipitacao> findByPostoId(String postoId);

}
