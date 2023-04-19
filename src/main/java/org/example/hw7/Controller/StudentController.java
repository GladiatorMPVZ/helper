package org.example.hw7.Controller;

import lombok.RequiredArgsConstructor;
import org.example.hw7.Dto.StudentDto;
import org.example.hw7.Service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<StudentDto> getAllStudents() {
        return studentService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    @PutMapping
    public StudentDto updateStudent(@RequestBody StudentDto studentDto) {
        return studentService.updateStudent(studentDto);
    }

    @PostMapping
    public ResponseEntity<?> saveNewStudent(@RequestBody StudentDto studentDto) {
        studentService.saveNewStudent(studentDto);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
}
