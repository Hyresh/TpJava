/*
package local.mappers;

import local.controllers.StudentController;
import local.dtos.StudentDTO;
import local.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component(value = "mapper1")
public class StudentMapper {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentMapper.class);
    public StudentEntity convertDtoToEntity(StudentDTO dto){
        StudentEntity entity = new StudentEntity();
        entity.setName(dto.getName());
        entity.setId(dto.getId());
        return entity;
    }
    public StudentDTO convertEntitytoDto(StudentEntity entity){
        StudentDTO dto = new StudentDTO();
        dto.setName(entity.getName());
        dto.setId(entity.getId());
        return dto;
    }
    public List<StudentEntity> convertDtoToEntities (List<StudentDTO> dtos){
        return dtos.stream().map(dto -> convertDtoToEntity(dto)).collect(Collectors.toList());
    }

    public List<StudentDTO> convertEntitiesToDtos (List<StudentEntity> entities){
       // LOGGER.debug("SALAM");
       // for (StudentEntity x : entities){
       //     LOGGER.debug("entity content ==>[{}]",x.toString());
     //   }
        if(entities!=null && !entities.isEmpty()) {
          //  List<StudentDTO> dtos = entities.stream().map(entity -> convertEntitytoDto(entity)).collect(Collectors.toList());
         //   for (StudentDTO x : dtos){
         //       LOGGER.debug("dto content ==>[{}]",x.toString());
         //   }
            return entities.stream().map(entity -> convertEntitytoDto(entity)).collect(Collectors.toList());
        }else {
         //   LOGGER.debug("List null");
            return new ArrayList<>();
        }
    }
}
*/
