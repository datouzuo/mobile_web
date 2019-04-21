package xin.mengzuo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import xin.mengzuo.controller.SessionInterceptor;
@Configuration
public class MvcConfigurer  implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
		WebMvcConfigurer.super.addCorsMappings(registry);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new SessionInterceptor())
		.addPathPatterns("/item/**");
		WebMvcConfigurer.super.addInterceptors(registry);
	}
  
}
