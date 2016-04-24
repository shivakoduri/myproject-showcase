/**
 * 
 */
package com.myproject.showcase.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.myproject.showcase.config.RepositoryHibernateConfiguration;

/**
 * @author shiva koduri
 *
 */
@Configuration
@ComponentScan({ "com.myproject.showcase" })
@Import(RepositoryHibernateConfiguration.class)
public class MyProjectServiceConfig {

}
