package org.example.controllers;

import org.example.services.IStudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentServices service;

   // public StudentController(IStudentServices service) {
   //     this.service = service;
   // }

    @GetMapping("/{id}")
    public Double getNote(@PathVariable("id") Long idStudent){
        System.out.println("Service : "+service);
        System.out.println(" Level Controller idStudent : " +idStudent);
        return service.getNoteStudent(idStudent);
    }
    public StudentController() {
        System.out.println(" Instanciation Controller... ");
    }
}
