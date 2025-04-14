package org.rafs.pluvapp.infra.persistence.repository.relational;

import org.rafs.pluvapp.infra.persistence.entity.relational.PrecipitacaoEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("relational")
public interface PrecipitacaoRepository extends JpaRepository<PrecipitacaoEntity, Long> {
    List<PrecipitacaoEntity> findByPostoId(String postoId);
}
