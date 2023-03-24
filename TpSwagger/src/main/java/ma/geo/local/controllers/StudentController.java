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

    private StudentService studentService;
    @PostMapping
    public StudentDTO save(@RequestBody StudentDTO dto){
        LOGGER.debug("save method",dto);
        return studentService.save(dto);
    }
    @PutMapping
    public StudentDTO update(@RequestBody StudentDTO dto){
        LOGGER.debug("update method", dto);
        return studentService.update(dto);
    }
    @DeleteMapping("/{ids}")
    public boolean delete(@PathVariable("ids") long id){
        LOGGER.debug("delete method",id);
        return studentService.delete(id);
    }
    @GetMapping
    public List<StudentDTO> SelectAll(){
        LOGGER.debug("select method");
        return studentService.SelectAll();
    }
}
