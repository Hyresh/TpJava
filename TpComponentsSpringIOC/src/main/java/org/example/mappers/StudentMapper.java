package org.example.mappers;

import org.example.dtos.StudentDto;
import org.example.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    public StudentEntity convertToEntity(StudentDto d){
        StudentEntity entity = new StudentEntity();
        entity.setName(d.getName());
        entity.setId(d.getId());
        return entity;
    }
    StudentDto convertToDto(StudentEntity e){
        StudentDto dto = new StudentDto();
        dto.setId(e.getId());
        dto.setName(e.getName());
        return dto;
    }
    List<StudentEntity> convertToEntities(List<StudentDto> dto){
        return dto.stream()
                .map(d->convertToEntity(d))
                .collect(Collectors.toList());
    }
    public List<StudentDto> convertToDtos(List<StudentEntity> entities){
        return entities.stream()
                .map(e->convertToDto(e))
                .collect(Collectors.toList());
    }
}
