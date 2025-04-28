package org.rafs.pluvapp.infra.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@Profile("nosql")
@EnableMongoRepositories(
        basePackages = "org.rafs.pluvapp.infra.persistence.repository.nosql"
)
public class MongoConfigNosql {
}
