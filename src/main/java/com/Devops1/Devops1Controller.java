package com.Devops1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Devops1Controller {
	@GetMapping("getdevvals")
	public String getdev() {
		return "Happy vinayager Sathurthy";
	}

}
