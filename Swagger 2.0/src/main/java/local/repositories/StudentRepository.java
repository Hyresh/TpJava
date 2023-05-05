package local.repositories;

import local.entities.StudentEntity;
import local.entities.StudentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("repo1")
public interface StudentRepository extends JpaRepository<StudentEntity, StudentId>{
    //void deleteByStudentId(StudentId studentId);

}
