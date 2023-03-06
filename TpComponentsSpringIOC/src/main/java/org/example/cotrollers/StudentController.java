package org.example.cotrollers;

import org.example.dtos.StudentDto;
import org.example.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {
    @Autowired
    private StudentService service;
    @PostMapping
    public Long save(StudentDto dto){
        return service.Save(dto);
    }
    @PutMapping
    public boolean update(StudentDto dto){
        return service.Update(dto);
    }
    @DeleteMapping
    public boolean delete(Long id){
        return service.DeleteById(id);
    }
    @GetMapping
    public List<StudentDto> selectAll(){
        return service.SelectAll();
    }
}
