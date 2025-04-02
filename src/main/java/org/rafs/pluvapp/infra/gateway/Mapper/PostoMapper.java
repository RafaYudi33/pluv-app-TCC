package org.rafs.pluvapp.infra.gateway.Mapper;

import org.rafs.pluvapp.domain.model.Posto;
import org.rafs.pluvapp.infra.persistence.entity.nosql.PostoDocument;
import org.rafs.pluvapp.infra.persistence.entity.relational.PostoEntity;
import org.springframework.stereotype.Component;

@Component
public class PostoMapper {

    public PostoEntity toPostoEntity(Posto posto) {
        return new PostoEntity(
                posto.nome(),
                posto.municipio(),
                posto.bacia(),
                posto.altitude(),
                posto.latitude(),
                posto.longitude(),
                posto.anoInicial(),
                posto.anoFinal(),
                posto.intervalo(),
                posto.consistencia()
        );
    }

    public Posto toPostoDomainObj(PostoEntity postoEntity){
        return new Posto(
                postoEntity.getId(),
                postoEntity.getNome(),
                postoEntity.getMunicipio(),
                postoEntity.getBacia(),
                postoEntity.getAltitude(),
                postoEntity.getLatitude(),
                postoEntity.getLongitude(),
                postoEntity.getAno_final(),
                postoEntity.getAno_final(),
                postoEntity.getIntervalo(),
                postoEntity.getConsistencia()
                );
    }

    public Posto toPostoDomainObj(PostoDocument postoDocument){
        return new Posto(
                postoDocument.getId(),
                postoDocument.getNome(),
                postoDocument.getMunicipio(),
                postoDocument.getBacia(),
                postoDocument.getAltitude(),
                postoDocument.getLatitude(),
                postoDocument.getLongitude(),
                postoDocument.getAno_inicial(),
                postoDocument.getAno_final(),
                postoDocument.getIntervalo(),
                postoDocument.getConsistencia()
        );
    }

}
