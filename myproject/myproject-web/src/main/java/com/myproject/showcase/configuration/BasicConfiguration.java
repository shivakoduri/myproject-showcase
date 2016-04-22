/**
 * 
 */
package com.myproject.showcase.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author shiva koduri
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.myproject.showcase")
public class BasicConfiguration extends WebMvcConfigurerAdapter{
	
	@Bean(name="viewResolver")
	public ViewResolver viewResolver(){
		InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
		resourceViewResolver.setViewClass(JstlView.class);
		resourceViewResolver.setPrefix("/WEB-INF/views/");
		resourceViewResolver.setSuffix(".jsp");
		
		return resourceViewResolver;
	}
	
	
	/**
	 * Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}
	
	

}
