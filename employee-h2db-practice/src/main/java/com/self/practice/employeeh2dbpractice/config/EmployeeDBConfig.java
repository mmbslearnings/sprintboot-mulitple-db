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
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.self.practice.employeeh2dbpractice.repository.employee.EmployeeRepository;

/**
 * @author mmbsh
 *
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "empEntityManagerFactory", 
		transactionManagerRef = "empTransactionManager", 
		basePackages = "com.self.practice.employeeh2dbpractice.repository.employee", 
		repositoryBaseClass = EmployeeRepository.class
	)
public class EmployeeDBConfig {

	@Bean(name = "empDataSource")
	@Primary
	@ConfigurationProperties(prefix = "spring.employee")
	public DataSource empDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "empEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean empEntityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("empDataSource") DataSource primaryDataSource) {
		return builder.dataSource(primaryDataSource).packages("com.self.practice.employeeh2dbpractice.repository.address")
				.build();
	}

	@Primary
	@Bean(name = "empTransactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("empEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}

}
