package org.example.services;

import org.example.dtos.StudentDto;
import org.example.entities.StudentEntity;

import java.util.List;

public interface StudentService {
    Long Save(StudentDto dto);
    boolean Update(StudentDto dto);
    boolean DeleteById(Long id);
    List<StudentDto> SelectAll();
}
