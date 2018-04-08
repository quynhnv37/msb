package com.dxc.ihub.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.dxc.ihub.model.DatabaseInfo;

@Configuration
@PropertySource("classpath:dataSource/data-connect.properties")
public class AppConfig {
    @Value( "${database.url}" )
    private String databaseUrl;
    @Value( "${database.username}" )
    private String databaseUsername;
    @Value( "${database.password}" )
    private String databasePassword;
    
	@Bean
	DatabaseInfo getDatabaseInfo() {
		return new DatabaseInfo(this.databaseUrl, this.databaseUsername, this.databasePassword);
	}
	
	
}
