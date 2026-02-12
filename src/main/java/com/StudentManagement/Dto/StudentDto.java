package com.StudentManagement.Dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({
        "id",
        "firstName",
        "lastName",
        "email",
        "course"
})
public class StudentDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String course;
}
