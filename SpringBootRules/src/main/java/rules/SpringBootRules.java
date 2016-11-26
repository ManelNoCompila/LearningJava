package rules;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class SpringBootRules{
    public static void main (String [] args) throws Exception{
        SpringApplication.run(SpringBootRules.class, args);
    }
    @RequestMapping("/**")
    String allSite (){
        return "Spring Boot Rules!!!";
    }
}