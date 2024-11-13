package com.capgemini.in.SpringUsingJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

	@Bean(name="myColorBean")
	public MyColor getMyColors() {
		return new RedColor();
	}
	@Bean(name="myColorBeanBlue")
	public MyColor getMyColorstwo() {
		return new BlueColor();
	}
}
