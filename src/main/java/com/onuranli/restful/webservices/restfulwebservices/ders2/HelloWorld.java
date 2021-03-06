package com.onuranli.restful.webservices.restfulwebservices.ders2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	 static int counter;
	
//	@GetMapping(path = "helloWorld")
	@RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
	public String helloWorld(){
		return "Hello Restful Service";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/objectExample")
	public Person getPerson(){
		return new Person("Onur", "Anli", 26);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/counter+")
	public int getCounterIncrease(){
		return ++counter;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/counter-")
	public int getCounterIncreaseDecrease(){
		return --counter;
	}
}
