package org.rafs.pluvapp.infra.persistence.repository.mysqlwjson;

import org.rafs.pluvapp.infra.persistence.entity.mysqlwjson.PrecipitacaoEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("mysqlwjson")
public interface PrecipitacaoMysqlWjson extends JpaRepository<PrecipitacaoEntity, Long> {
}
