package io.github.dvoss4.algoDemonstration;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fizzbuzz {
    @PostMapping
    public String FizzBuzz(int number) {
        for(int i = 0; i <= number; i++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("io.github.dvoss4.algoDemonstration.FizzBuzz");
            }else if(number % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(number % 5 == 0) {
                System.out.println("Buzz");
            }
        }
        return "";
    }
}
