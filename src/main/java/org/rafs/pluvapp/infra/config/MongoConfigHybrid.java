package org.rafs.pluvapp.infra.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@Profile("hybrid")
@EnableMongoRepositories(
        basePackages = "org.rafs.pluvapp.infra.persistence.repository.hybrid"
)
public class MongoConfigHybrid {

}
