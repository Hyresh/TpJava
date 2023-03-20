package ma.geo.local.controllers;

import ma.geo.local.dtos.StudentDTO;
import ma.geo.local.repositories.StudentRepositoryImpl;
import ma.geo.local.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;
    @PostMapping
    public StudentDTO save(StudentDTO dto){
        LOGGER.debug("save method");
        return studentService.save(dto);
    }
    @PutMapping
    public StudentDTO update(StudentDTO dto){
        LOGGER.debug("update method");
        return studentService.update(dto);
    }
    @DeleteMapping
    public boolean delete(long id){
        LOGGER.debug("delete method");
        return studentService.delete(id);
    }
    @GetMapping
    public List<StudentDTO> SelectAll(){
        LOGGER.debug("select method");
        return studentService.SelectAll();
    }
}
