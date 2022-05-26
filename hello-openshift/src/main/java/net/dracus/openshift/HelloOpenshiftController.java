package net.dracus.openshift;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello", produces = "application/json")
public class HelloOpenshiftController {
	
	@Value("${dracus.msg1}")
	private String msg1;
	
	@Value("${dracus.msg2}")
	private String msg2;

	@GetMapping("")
	public String sayHello() {
		var result = "Openshift test application\n";
		result = result + "Message 1: " + msg1 + "\n";
		result = result + "Message 2: " + msg2 + "\n";
		return result;
	}

	@GetMapping("{message}")
	public String sayHello(@PathVariable String message) {
		return "Hello " + message + "\n";
	}

}
