package com.wx.filemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class FilemanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilemanagerApplication.class, args);
	}

}

