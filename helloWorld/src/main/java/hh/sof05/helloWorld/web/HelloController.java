package hh.sof05.helloWorld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/*")
	public String hello() {
		return "hello hello";
	}


}
