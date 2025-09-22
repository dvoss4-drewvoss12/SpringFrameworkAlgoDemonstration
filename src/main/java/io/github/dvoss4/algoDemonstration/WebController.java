package io.github.dvoss4.algoDemonstration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
        @RequestMapping("/")
        public String showHomePage(){
            return "frontend"; // look for frontend.html
        }
        @GetMapping("/fizzbuzz")
        public String showFizzBuzzPage(){
            return "fizzbuzz";
        }
        @GetMapping("/error")
        public String showErrorPage(){
            return "error";
        }
}


