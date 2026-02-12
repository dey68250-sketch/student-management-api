package com.StudentManagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@jakarta.persistence.Entity
@Table(name  = "Students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @Column(nullable = false)
     private String firstName;

     @Column(nullable = false)
     private String lastName;

     @Column(unique = true)
     private String email;

     @Column(nullable = false,length = 100)
     private String course;

}
