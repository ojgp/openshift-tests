package net.dracus.openshift;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/backend", produces = "application/json")
public class BackendOpenshiftController {

	@Value("${dracus.msg1}")
	private String msg1;

	@Value("${dracus.msg2}")
	private String msg2;

	@Value("${dracus.msg3}")
	private String msg3;

	@Value("${dracus.secret}")
	private String secret;
	
	@GetMapping("")
	public String sayHello() {
		return "Openshift backend test application\n";
	}

	@GetMapping("env")
	public ResponseEntity<BackendDto> getEnv() {
		return ResponseEntity.ok(new BackendDto(msg1, msg2, msg3, secret));
	}
}
