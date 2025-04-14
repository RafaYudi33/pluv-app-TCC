package org.rafs.pluvapp.infra.persistence.repository.relational;
import org.rafs.pluvapp.infra.persistence.entity.relational.PostoEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@Profile({"relational", "mysqlwjson"})
public interface PostoRepository extends JpaRepository<PostoEntity, Long> {
    public Optional<PostoEntity> findById(String id);
}
