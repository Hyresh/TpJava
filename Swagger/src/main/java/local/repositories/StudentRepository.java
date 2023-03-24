package local.repositories;

import local.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {
    StudentEntity save(StudentEntity entity);
    StudentEntity update(StudentEntity entity);
    boolean delete(long id);
    List<StudentEntity> selectAll();

}
