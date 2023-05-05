package local.mappers;

import local.dtos.StudentDTO;
import local.dtos.StudentIdDTO;
import local.entities.StudentEntity;
import local.entities.StudentId;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MapperStudent {
    StudentEntity studentDtoToEntity(StudentDTO dto);
    StudentDTO studentEntityToDto(StudentEntity studentEntity) ;
    List<StudentDTO> studentEntiesToDtos(List<StudentEntity> studentEntities) ;
    StudentId studentIdDTOToStudentId(StudentIdDTO studentIdDTO);
}
