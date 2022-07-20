package com.example.AC2demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllertwo{
   @GetMapping("getcontroller2page")   // either type '/' or index
   public String showIndex()
   {
	      System.out.println("IN  MyControllertwo->showIndex()");
          return "controller2";
   }
}