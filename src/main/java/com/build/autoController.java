package com.build;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class autoController {
@GetMapping(value="getvalue")
public String get() {
	return "Automation Successfully";
}
}
