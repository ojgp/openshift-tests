package net.dracus.openshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello", produces = "application/json")
public class HelloOpenshiftController {

	@GetMapping("")
	public String sayHello() {
		return "Openshift test application\n";
	}

	@GetMapping("{message}")
	public String sayHello(@PathVariable String message) {
		return "Hello " + message + "\n";
	}

}
