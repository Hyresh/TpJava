package org.example.services;

import org.example.repositories.IStudentRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class StudnetServiceImpl implements IStudentServices{

    @Autowired
    private IStudentRpository repository;

   // public StudnetServiceImpl(IStudentRpository repository) {
   //     this.repository = repository;
   // }

    @Override
    public Double getNoteStudent(Long idStudent){
        System.out.println("Repository : "+repository);
        System.out.println("Level Service idStudent : " +idStudent);
        return repository.getNote(idStudent);
    }

    public StudnetServiceImpl(){
        System.out.println(" Instanciation Service... ");
    }
}
