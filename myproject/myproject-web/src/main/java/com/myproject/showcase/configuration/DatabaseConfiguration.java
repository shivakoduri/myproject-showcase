package com.myproject.showcase.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.myproject.showcase.service.config.MyProjectServiceConfig;


/**
 * 
 * @author shiva koduri
 * 
 *         Hibernate configuration class contains @Bean
 *         methods for DataSource, SessionFactory & Transaction Manager.
 *         Datasource properties are taken from application.properties file and
 *         contains connection details for MySQL database.
 *
 */
@Configuration
@Import(MyProjectServiceConfig.class)
public class DatabaseConfiguration {

}

