package com.example.demo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/{userId}")
    public ResponseEntity<String> greetUser(@PathVariable int userId) {

        String url = "http://localhost:8081/users/" + userId;

        try {
            ResponseEntity<User> resp = restTemplate.getForEntity(url, User.class);

            // אם לא קיבלנו 200 OK
            if (!resp.getStatusCode().is2xxSuccessful() || resp.getBody() == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                     .body("User not found");
            }

            String name = resp.getBody().getName();
            return ResponseEntity.ok("Hello " + name + "!");

        } catch (Exception ex) {                     // ייתפוס גם Connection refused
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                                 .body("user-service unavailable: " + ex.getMessage());
        }
    }

    @GetMapping("/test")
    public String test() {
        return "Greeting service is up!";
    }
    static class User {
        private int id;
        private String name;

        public User() {} // חייב קונסטרקטור ריק לספרינג

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
