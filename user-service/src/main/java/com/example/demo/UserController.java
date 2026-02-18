package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController   
@RequestMapping("/users")
public class UserController { 

    private static final Map<Integer, User> users = new HashMap<>();

    static {
        users.put(1, new User(1, "Dana"));
        users.put(2, new User(2, "Yael"));
        users.put(3, new User(3, "Moshe"));
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return users.getOrDefault(id, new User(id, "Unknown"));
    }

    // DTO קטן ל‑JSON
    static class User {
        private int id;
        private String name;

        public User() {}          // נדרש לסריאליזציה

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId()   { return id; }
        public String getName() { return name; }
    }
}
