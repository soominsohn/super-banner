package com.github.soominsohn.banner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SuperBannerApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SuperBannerApplication.class);
		application.setBanner(new CustomBanner());
		application.run(args);
	}
}
