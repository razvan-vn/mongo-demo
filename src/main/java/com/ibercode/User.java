package com.ibercode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data                       // Generates getters, setters, equals, hashCode, and toString methods
@NoArgsConstructor          // Generates a no-args constructor
@AllArgsConstructor
public class User {
    
    @Id
    private String id;
    private String name;
    private String email;

    // Constructors, Getters, Setters


    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
}
