package com.myproject.showcase.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.myproject.showcase.service.config.MyProjectServiceConfig;


/**
 * @author shiva koduri
 */
@Configuration
@Import(MyProjectServiceConfig.class)
public class ServiceConfiguration {

}

