package com.hao.chapter14;

import com.hao.chapter14.endpoint.MyEndPoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnEnabledEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Chapter14Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter14Application.class, args);
	}
	@Configuration
	static class MyEndpointConfiguration {
		@Bean
		@ConditionalOnMissingBean
		@ConditionalOnEnabledEndpoint
		public MyEndPoint myEndPoint() {
			return new MyEndPoint();
		}
	}
}
