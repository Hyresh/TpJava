package local.controllers;

import local.dtos.StudentDTO;
import local.dtos.StudentIdDTO;
import local.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    private StudentService studentService;
    public StudentController(@Qualifier("service1") StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public Long save(@RequestBody StudentDTO dto){
        LOGGER.debug("save method",dto);
        return studentService.save(dto);
    }
    @PutMapping
    public Long update(@RequestBody StudentDTO dto) {
        LOGGER.debug("method update",dto);
        return studentService.update(dto);
    }
    @DeleteMapping("/{id}/{code}")
    public Boolean deleteById(@PathVariable("id") long id,@PathVariable("code") String code) {
        LOGGER.debug(" method delete by id {} and code {}",id,code);
        StudentIdDTO finalId =new StudentIdDTO(id,code);
        return studentService.delete(finalId);
    }

    @GetMapping
    public List<StudentDTO> selectAll(){
        LOGGER.debug("select method");
        return studentService.SelectAll();
    }
}
