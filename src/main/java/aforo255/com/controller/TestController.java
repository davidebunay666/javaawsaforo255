package aforo255.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String TestFirstJob() {
		return "Welcome to MasterDevops - DAVID BUÑAY |Tomcat v2345 | Ansible , AFORO255 09112022";
	}
}
