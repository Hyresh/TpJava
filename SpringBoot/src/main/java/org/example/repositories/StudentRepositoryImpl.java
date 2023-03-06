package org.example.repositories;

import org.example.services.StudnetServiceImpl;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequestMapping("/students")
public class StudentRepositoryImpl implements IStudentRpository{
    @Override
    public Double getNote(Long idStudent){
        System.out.println("Level Repository idStudent : " +idStudent);
        return 10.5;
    }

    public StudentRepositoryImpl(){
        System.out.println(" Instanciation Repository... ");
    }
}
