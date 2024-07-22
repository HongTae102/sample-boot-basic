package th.mfu;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    String[] validNames = {"A", "B", "C"};

    @GetMapping("/hi/{name}")
    ResponseEntity<String> hi(@PathVariable String name){
        // return ResponseEntity.ok("Hi "+ name);
        // return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        for(String validName : validNames){
            if(validName.equals(name))
            return ResponseEntity.ok("Hi " + name);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    @RequestMapping("/hello")
    String hello() {
        return "Hello World!";
    }

   
}
