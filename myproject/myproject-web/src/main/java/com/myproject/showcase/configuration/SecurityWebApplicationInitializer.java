package com.myproject.showcase.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * 
 * @author shiva koduri
 * Register the springSecurityFilter with war
 * Below specified initializer class registers the springSecurityFilter with application war.
 * 
 */

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {


	/**
	 * Above setup in XML configuration format would be:
	 * 
	<filter>
	    <filter-name>springSecurityFilterChain</filter-name>
	    <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
	</filter>
	 
	<filter-mapping>
	    <filter-name>springSecurityFilterChain</filter-name>
	    <url-pattern>/*</url-pattern>
	</filter-mapping>
	 */
}
