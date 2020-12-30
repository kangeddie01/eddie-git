package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class ChParam {
	private String driverClassName;
    private String url;
    private String user;
    private String password;
    private Integer initialSize;
    private Integer maxActive;
    private Integer minIdle;
    private Integer maxWait;
    
	public String getDriverClassName() {
		return driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public String getUser() {
		return user;
	}
	public String getPassword() {
		return password;
	}
	public Integer getInitialSize() {
		return initialSize;
	}
	public Integer getMaxActive() {
		return maxActive;
	}
	public Integer getMinIdle() {
		return minIdle;
	}
	public Integer getMaxWait() {
		return maxWait;
	}
    
    @Value("${clickhouse.driverClassName}")
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
    @Value("${clickhouse.url}")
    public void setUrl(String url) {
        this.url = url;
    }
    @Value("${clickhouse.user}")
    public void seUser(String user) {
        this.user = user;
    }
    @Value("${clickhouse.password}")
    public void setPassword(String password) {
        this.password = password;
    }

    @Value("${clickhouse.initialSize}")
    public void setInitialSize(Integer initialSize) {
        this.initialSize = initialSize;
    }

    @Value("${clickhouse.maxActive}")
    public void setMaxActive(Integer maxActive) {
        this.maxActive = maxActive;
    }

    @Value("${clickhouse.minIdle}")
    public void setMinIdle(Integer minIdle) {
        this.minIdle = minIdle;
    }

    @Value("${clickhouse.maxWait}")
    public void setMaxWait(Integer maxWait) {
        this.maxWait = maxWait;
    }
}
