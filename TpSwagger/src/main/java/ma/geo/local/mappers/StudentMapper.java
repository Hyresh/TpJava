package ma.geo.local.mappers;

import ma.geo.local.dtos.StudentDTO;
import ma.geo.local.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    public StudentEntity convertDtoToEntity(StudentDTO dto){
        StudentEntity entity = new StudentEntity();
        entity.setNama(dto.getName());
        entity.setId(dto.getId());
        return entity;
    }
    public StudentDTO convertEntitytoDto(StudentEntity entity){
        StudentDTO dto = new StudentDTO();
        dto.setName(entity.getNama());
        dto.setId(entity.getId());
        return dto;
    }
    public List<StudentEntity> convertDtoToEntities (List<StudentDTO> dtos){
        return dtos.stream().map(dto -> convertDtoToEntity(dto)).collect(Collectors.toList());
    }

    public List<StudentDTO> convertEntitiesToDtos (List<StudentEntity> entities){
        if(entities!=null&&entities.isEmpty()) {
            return entities.stream().map(entity -> convertEntitytoDto(entity)).collect(Collectors.toList());
        }else {
            return new ArrayList<>();
        }
    }
}
