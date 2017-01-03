package com.pic.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/hello")
public class HelloController {

	// @Value("${cupSize}")
	// private String cupSize;
	//
	// @Value("${age}")
	// private Integer age;
	//
	// @Value("${content}")
	// private String content;

	@Autowired
	private GirlProperties girlProperties;

	// @RequestMapping(value = {"/say"}, method = RequestMethod.GET)
	// @PostMapping
	// @PutMapping
	@GetMapping(value = "/say")
	public String say(
			@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
		// return "Hello Spring Boot!";
		// return content;
		// return girlProperties.getCupSize();
		// return "index";
		return "id: " + id;
	}
}
