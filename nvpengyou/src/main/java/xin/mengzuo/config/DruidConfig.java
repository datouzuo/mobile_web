package xin.mengzuo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DruidConfig {
    
	@Bean
	public DataSource dataSource(Environment env) {
		DruidDataSource druid = new DruidDataSource();
		druid.setUrl(env.getProperty("spring.datasource.url"));
		druid.setUsername(env.getProperty("spring.datasource.data-username"));
		druid.setPassword(env.getProperty("spring.datasource.password"));
		druid.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		return druid;
	}
}
