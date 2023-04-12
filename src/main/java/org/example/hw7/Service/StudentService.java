package org.example.hw7.Service;

import lombok.RequiredArgsConstructor;
import org.example.hw7.Converter.StudentConverter;
import org.example.hw7.Dto.StudentDto;
import org.example.hw7.Entity.Student;
import org.example.hw7.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentConverter studentConverter;

    public List<StudentDto> findAll() {
        return studentRepository.findAll().stream().map(studentConverter::entityToDto).collect(Collectors.toList());
    }

    public void saveNewStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setName(studentDto.getName());
        student.setAge(studentDto.getAge());
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public StudentDto updateStudent(StudentDto studentDto) {
        Student student = studentRepository.getById(studentDto.getId());
        student.setName(studentDto.getName());
        student.setAge(studentDto.getAge());
        return studentConverter.entityToDto(studentRepository.save(student));
    }

}
