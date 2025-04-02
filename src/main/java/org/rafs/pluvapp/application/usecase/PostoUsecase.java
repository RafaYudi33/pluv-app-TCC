package org.rafs.pluvapp.application.usecase;

import org.rafs.pluvapp.application.gateway.PostoGateway;
import org.rafs.pluvapp.domain.model.Posto;
import org.springframework.stereotype.Service;

@Service
public class PostoUsecase {
    private final PostoGateway gateway;

    public PostoUsecase(PostoGateway gateway) {
        this.gateway = gateway;
    }

    public Posto findById(String id){
        return gateway.findById(id);
    }

}
