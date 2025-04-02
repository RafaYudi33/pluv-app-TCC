package org.rafs.pluvapp.infra.persistence.repository.jpa;

import org.rafs.pluvapp.infra.persistence.entity.relational.PrecipitacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrecipitacaoRepository extends JpaRepository<PrecipitacaoEntity, Long> {
    List<PrecipitacaoEntity> findByPostoId(String postoId);
}
