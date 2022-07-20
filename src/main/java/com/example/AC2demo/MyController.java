package com.example.AC2demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class MyController {
   @RequestMapping({"/login"})   // either type '/' or index
   public String showlogin()
   {
	   System.out.println("IN  MyController->showlogin()");
       return "inboxpage";
   }
   @RequestMapping("/")
   public String simplemethod() {
       //mapped to hostname:port/home/
	   System.out.println("IN  MyController->simplemethod()");
       return "inboxpage";
   }
   @RequestMapping("/index")
   public String showindex() {
       //mapped to hostname:port/home/index/
	   System.out.println("IN  MyController->showindex()");
       return "index";
   }
}
