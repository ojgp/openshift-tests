package net.dracus.openshift;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/hello", produces = "application/json")
public class HelloOpenshiftController {

	@Value("${backend.url}")
	private String backendUrl;

	private RestTemplate template = new RestTemplate();

	@GetMapping("")
	public String sayHello() {
		return "Openshift hello test application\n";
	}

	@GetMapping("{message}")
	public String sayHello(@PathVariable String message) {
		var result = "Openshift hello test application\n";
		result = result + "Hello " + message + "\n";
		return result;
	}

	@GetMapping("env")
	public String callBackend() {
		var backendResponse = template.getForEntity(backendUrl + "/backend/env", BackendResponse.class);

		var response = "Openshift hello test application\n";
		response = response + backendResponse;
		return response;
	}

}
