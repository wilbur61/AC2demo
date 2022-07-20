package com.example.AC2demo;

//Java Program to Illustrate DemoController

//Importing required classes
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Annotation
@Controller

//Class
public class DemoController {

	@RequestMapping("/hello")
	
	//The @ResponseBody annotation tells a controller 
	//that the object returned is automatically serialized 
	//into JSON and passed back into the HttpResponse object.
	
	@ResponseBody

	// Method
	public String helloWorld()
	{

		// Print statement
		return "Hello World!";
	}
}
