package local.services;

import local.dtos.StudentDTO;
import local.dtos.StudentIdDTO;

import java.util.List;

public interface StudentService {
    Long save(StudentDTO dto);
    Long update(StudentDTO dto);
    Boolean delete(StudentIdDTO idDto);
    List<StudentDTO> SelectAll();

}
