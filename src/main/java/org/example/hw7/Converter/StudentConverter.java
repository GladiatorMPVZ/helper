package org.example.hw7.Converter;

import org.example.hw7.Dto.StudentDto;
import org.example.hw7.Entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter {

    public StudentDto entityToDto(Student student) {
        return new StudentDto(student.getId(), student.getName(), student.getAge());
    }
}
