package com.chainsys.projcetA.appconfig;

import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.chainsys.projectA.beans.Customer;
import com.chainsys.projectA.beans.Employee;
@Configuration
public class AppConfig {
	@Bean
	@Scope(value="prototype")
	public com.chainsys.projectA.beans.Employee employee() {
		return new com.chainsys.projectA.beans.Employee();
	}
	@Bean
	public com.chainsys.projectA.beans.Customer customer() {
		return new com.chainsys.projectA.beans.Customer();
	}
}