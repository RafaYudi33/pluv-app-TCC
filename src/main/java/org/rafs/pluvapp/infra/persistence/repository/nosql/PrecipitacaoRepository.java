package org.rafs.pluvapp.infra.persistence.repository.nosql;


import org.rafs.pluvapp.infra.persistence.entity.hybrid.PrecipitacaoDocument;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

@Profile("nosql")
public interface PrecipitacaoRepository extends MongoRepository<PrecipitacaoDocument, String> {
    @Query("{ 'posto_id' : ?0 }")
    List<PrecipitacaoDocument> findByPostoId(String id);
}
