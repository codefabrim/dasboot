package com.boot.config;


import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    @Primary
    public DataSource datasource(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix="spring.flyway")
    @FlywayDataSource
    public DataSource flywayDatasource(){
        return DataSourceBuilder.create().build();
    }
}


