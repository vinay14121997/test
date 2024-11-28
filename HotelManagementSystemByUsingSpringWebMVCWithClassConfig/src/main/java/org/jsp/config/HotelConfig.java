package org.jsp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages ="org.jsp")
public class HotelConfig {
	@Bean
	public InternalResourceViewResolver ViewResolver()
	{
		InternalResourceViewResolver internalresourceviewresolver=
				new InternalResourceViewResolver();
		internalresourceviewresolver.setPrefix("/");
		internalresourceviewresolver.setSuffix(".jsp");
		return internalresourceviewresolver;
		
	}
}
