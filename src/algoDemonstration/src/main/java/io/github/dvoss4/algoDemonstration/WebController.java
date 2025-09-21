package io.github.dvoss4.algoDemonstration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class WebController {
        @GetMapping("/")
        public String showHomePage(){
            return "Frontend"; // look for frontend.html
        }
}
