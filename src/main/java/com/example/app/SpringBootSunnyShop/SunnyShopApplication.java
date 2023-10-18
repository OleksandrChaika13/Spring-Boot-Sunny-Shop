package com.example.app.SpringBootSunnyShop;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.logging.Logger;

@SpringBootApplication
public class SunnyShopApplication {

	private static final Logger LOGGER =
			Logger.getLogger(SunnyShopApplication.class.getName());

	public static void main(String[] args) {

		new SpringApplicationBuilder(SunnyShopApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);

		LOGGER.info("APP is running...");
	}
}