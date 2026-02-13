package com.astroitsolutions.data_services;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.astroitsolutions.data_services.Entity")
@EnableJpaRepositories(basePackages = "com.astroitsolutions.data_services.Repository")
public class DataServicesConfiguration {

}
