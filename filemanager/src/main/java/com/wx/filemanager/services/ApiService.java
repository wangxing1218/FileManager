package com.wx.filemanager.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiService {
	@RequestMapping("/test")
	public String index() {
		return "Filemanager is running";
	}
}
