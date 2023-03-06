package org.example.services;

import org.example.dtos.StudentDto;
import org.example.entities.StudentEntity;
import org.example.mappers.StudentMapper;
import org.example.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentSeviceImpl implements StudentService{
    @Autowired
    private StudentRepository repository;
    @Autowired
    private StudentMapper mapper;

    public Long Save(StudentDto dto){
        StudentEntity e = mapper.convertToEntity(dto);
        return repository.Save(e);
    }
    public boolean Update(StudentDto dto){
        StudentEntity e = mapper.convertToEntity(dto);
        return repository.Update(e);
    }
    public boolean DeleteById(Long id){
        return repository.Delete(id);
    }
    public List<StudentDto> SelectAll(){
        List<StudentEntity> l = repository.SelectAll();
        List<StudentDto> ld = mapper.convertToDtos(l);
        return ld;
    }
}
