package org.rafs.pluvapp.infra.persistence.repository.nosql;

import org.rafs.pluvapp.infra.persistence.entity.nosql.PostoDocument;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

@Profile("nosql")
public interface PostoRepository extends MongoRepository<PostoDocument, String> {
    public Optional<PostoDocument> findById(String id);
}
