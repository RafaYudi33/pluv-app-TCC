package org.rafs.pluvapp.application.gateway;

import org.rafs.pluvapp.domain.model.Posto;

public interface PostoGateway {
    public Posto findById(String id);
}
