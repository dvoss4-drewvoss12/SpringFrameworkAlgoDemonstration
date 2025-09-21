package io.github.dvoss4.algoDemonstration;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fizzbuzz {
    @PostMapping("/fizzbuzz")
    public String FizzBuzz(@RequestParam("number") int number) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.append("FizzBuzz");
            }else if(i % 3 == 0) {
                result.append(("Fizz"));
            }
            else if(i % 5 == 0) {
                result.append(("Buzz"));
            }else{
                result.append(String.valueOf(i));
            }
        }
        return result.toString();
    }
}
