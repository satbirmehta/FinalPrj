package com.example.demo;

//testing import from github
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WelcomeController


    {

        @RequestMapping("/")
        public String homepage()
        {
            return "welcomehtml";
        }
    }

