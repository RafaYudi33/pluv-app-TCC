package org.rafs.pluvapp.infra.persistence.repository.mysqlwjson;
import org.rafs.pluvapp.infra.persistence.entity.mysqlwjson.PostoEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@Profile("mysqlwjson")
public interface PostoRepository extends JpaRepository<PostoEntity, Long> {
    public Optional<PostoEntity> findById(String id);
}
