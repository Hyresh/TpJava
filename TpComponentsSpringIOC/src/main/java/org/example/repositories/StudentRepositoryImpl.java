package org.example.repositories;

import org.example.entities.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.lang.Override;

import java.util.List;

@Component
public class StudentRepositoryImpl implements StudentRepository{
    @Autowired
    private StudentRepository repository;
    @Override
    public Long Save(StudentEntity e){
        return null;
    }
    @Override
    public boolean Update(StudentEntity e){
        return false;
    }
    @Override
    public boolean Delete(Long id){
        return false;
    }
    @Override
    public List<StudentEntity> SelectAll(){
        return null;
    }
}
