package org.rafs.pluvapp.infra.persistence.repository.relational;

import org.rafs.pluvapp.infra.persistence.dto.PrecipitacaoWithPostoId;
import org.rafs.pluvapp.infra.persistence.entity.relational.PrecipitacaoEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("relational")
public interface PrecipitacaoRepository extends JpaRepository<PrecipitacaoEntity, Long> {
    List<PrecipitacaoEntity> findByPostoId(String postoId);

    @Query("SELECT new org.rafs.pluvapp.infra.persistence.dto.PrecipitacaoWithPostoId(" +
            "p.posto.id, p.ano, p.mes, p.dia1, p.dia2, p.dia3, p.dia4, p.dia5, p.dia6, p.dia7, p.dia8, p.dia9, p.dia10, " +
            "p.dia11, p.dia12, p.dia13, p.dia14, p.dia15, p.dia16, p.dia17, p.dia18, p.dia19, p.dia20, p.dia21, " +
            "p.dia22, p.dia23, p.dia24, p.dia25, p.dia26, p.dia27, p.dia28, p.dia29, p.dia30, p.dia31) " +
            "FROM precip_relational p WHERE p.ano = :ano AND p.posto.id = :postoId")
    List<PrecipitacaoWithPostoId> findByPostoAno(@Param("ano") int ano, @Param("postoId") String postoId);
}
