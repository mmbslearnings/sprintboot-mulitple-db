/**
 * 
 */
package com.self.practice.employeeh2dbpractice.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @author mmbsh
 *
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "addressEntityManagerFactory", 
		transactionManagerRef = "addressTransactionManager", 
		basePackages = "com.self.practice.employeeh2dbpractice.repository.address"
	) 
public class AddressDBConfig {
	
	@Bean(name = "addressDataSource")
	@ConfigurationProperties(prefix = "spring.address")
	public DataSource addressDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "addressEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean addressEntityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("addressDataSource") DataSource addressDataSource) {
		return builder.dataSource(addressDataSource)
				.packages("com.self.practice.employeeh2dbpractice.repository.address")
				.build();
	}

	@Bean(name = "addressTransactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("addressEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}

}
