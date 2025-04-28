package org.rafs.pluvapp.infra.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Profile("postgreswjsonb")
@EnableJpaRepositories(
        basePackages = "org.rafs.pluvapp.infra.persistence.repository.postgreswjsonb"
)
@EntityScan(basePackages = "org.rafs.pluvapp.infra.persistence.entity.postgreswjsonb")
public class JpaConfigPostgresJsonb {
}
