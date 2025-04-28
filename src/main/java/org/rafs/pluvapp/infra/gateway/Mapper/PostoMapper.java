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

    public Posto toPostoDomainObj(PostoEntity postoEntityRelational){
        return new Posto(
                postoEntityRelational.getId(),
                postoEntityRelational.getNome(),
                postoEntityRelational.getMunicipio(),
                postoEntityRelational.getBacia(),
                postoEntityRelational.getAltitude(),
                postoEntityRelational.getLatitude(),
                postoEntityRelational.getLongitude(),
                postoEntityRelational.getAno_final(),
                postoEntityRelational.getAno_final(),
                postoEntityRelational.getIntervalo(),
                postoEntityRelational.getConsistencia()
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

    public Posto toPostoDomainObj(org.rafs.pluvapp.infra.persistence.entity.mysqlwjson.PostoEntity postoEntityMysqlJson){
        return new Posto(
                postoEntityMysqlJson.getId(),
                postoEntityMysqlJson.getNome(),
                postoEntityMysqlJson.getMunicipio(),
                postoEntityMysqlJson.getBacia(),
                postoEntityMysqlJson.getAltitude(),
                postoEntityMysqlJson.getLatitude(),
                postoEntityMysqlJson.getLongitude(),
                postoEntityMysqlJson.getAno_final(),
                postoEntityMysqlJson.getAno_final(),
                postoEntityMysqlJson.getIntervalo(),
                postoEntityMysqlJson.getConsistencia()
        );
    }

    public Posto toPostoDomainObj(org.rafs.pluvapp.infra.persistence.entity.postgreswjsonb.PostoEntity postoEntityPostgresJsonb){
        return new Posto(
                postoEntityPostgresJsonb.getId(),
                postoEntityPostgresJsonb.getNome(),
                postoEntityPostgresJsonb.getMunicipio(),
                postoEntityPostgresJsonb.getBacia(),
                postoEntityPostgresJsonb.getAltitude(),
                postoEntityPostgresJsonb.getLatitude(),
                postoEntityPostgresJsonb.getLongitude(),
                postoEntityPostgresJsonb.getAno_final(),
                postoEntityPostgresJsonb.getAno_final(),
                postoEntityPostgresJsonb.getIntervalo(),
                postoEntityPostgresJsonb.getConsistencia()
        );
    }

    public Posto toPostoDomainObj(org.rafs.pluvapp.infra.persistence.entity.hybrid.PostoEntity posto) {
        return new Posto(
                posto.getId(),
                posto.getNome(),
                posto.getMunicipio(),
                posto.getBacia(),
                posto.getAltitude(),
                posto.getLatitude(),
                posto.getLongitude(),
                posto.getAno_final(),
                posto.getAno_final(),
                posto.getIntervalo(),
                posto.getConsistencia()
        );
    }
}
