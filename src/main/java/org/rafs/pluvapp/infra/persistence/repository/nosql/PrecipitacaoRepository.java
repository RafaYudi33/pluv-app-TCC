package org.rafs.pluvapp.infra.persistence.repository.nosql;


import org.rafs.pluvapp.infra.persistence.dto.PrecipitacaoWithPostoId;
import org.rafs.pluvapp.infra.persistence.entity.hybrid.PrecipitacaoDocument;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

@Profile("nosql")
public interface PrecipitacaoRepository extends MongoRepository<PrecipitacaoDocument, String> {
    @Query("{ 'posto_id' : ?0 }")
    List<PrecipitacaoDocument> findByPostoId(String id);

    @Aggregation(pipeline = {
            "{ $match: { 'ano': ?0, 'posto_id': ?1 } }",
            "{ $project: { _id: 0, posto_id: 1, ano: 1, mes: 1, dados: 1 } }"
    })
    List<PrecipitacaoWithPostoId> findByPostoAno(int ano, String posto_id);
}
