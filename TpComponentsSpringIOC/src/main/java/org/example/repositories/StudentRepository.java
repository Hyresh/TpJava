package org.example.repositories;

import org.example.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {
    Long Save(StudentEntity e);
    boolean Update(StudentEntity e);
    boolean Delete(Long id);
    List<StudentEntity> SelectAll();
}
