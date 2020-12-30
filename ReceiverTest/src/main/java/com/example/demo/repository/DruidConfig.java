package com.example.demo.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DruidConfig {
	@Autowired
	private ChParam chParam;

	@Bean
	public DataSource dataSource() {
		
		
		DruidDataSource datasource = new DruidDataSource();
		datasource.setUrl(chParam.getUrl());
		datasource.setDriverClassName(chParam.getDriverClassName());
		datasource.setInitialSize(chParam.getInitialSize());
		datasource.setMinIdle(chParam.getMinIdle());
		datasource.setMaxActive(chParam.getMaxActive());
		datasource.setMaxWait(chParam.getMaxWait());
		datasource.setPassword(chParam.getPassword());
		datasource.setUsername(chParam.getUser());
		return datasource;
	}
}
