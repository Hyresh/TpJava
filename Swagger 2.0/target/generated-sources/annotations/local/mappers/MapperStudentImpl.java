package local.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import local.dtos.AdressDTO;
import local.dtos.CourseDTO;
import local.dtos.StudentDTO;
import local.dtos.StudentIdDTO;
import local.entities.Adress;
import local.entities.Course;
import local.entities.StudentEntity;
import local.entities.StudentId;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-04T22:37:56+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class MapperStudentImpl implements MapperStudent {

    @Override
    public StudentEntity studentDtoToEntity(StudentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setCourses( courseDTOListToCourseList( dto.getCourses() ) );
        studentEntity.setStudentId( studentIdDTOToStudentId( dto.getStudentId() ) );
        studentEntity.setAdress( adressDTOToAdress( dto.getAdress() ) );

        return studentEntity;
    }

    @Override
    public StudentDTO studentEntityToDto(StudentEntity studentEntity) {
        if ( studentEntity == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setStudentId( studentIdToStudentIdDTO( studentEntity.getStudentId() ) );
        studentDTO.setCourses( courseListToCourseDTOList( studentEntity.getCourses() ) );
        studentDTO.setAdress( adressToAdressDTO( studentEntity.getAdress() ) );

        return studentDTO;
    }

    @Override
    public List<StudentDTO> studentEntiesToDtos(List<StudentEntity> studentEntities) {
        if ( studentEntities == null ) {
            return null;
        }

        List<StudentDTO> list = new ArrayList<StudentDTO>( studentEntities.size() );
        for ( StudentEntity studentEntity : studentEntities ) {
            list.add( studentEntityToDto( studentEntity ) );
        }

        return list;
    }

    @Override
    public StudentId studentIdDTOToStudentId(StudentIdDTO studentIdDTO) {
        if ( studentIdDTO == null ) {
            return null;
        }

        StudentId studentId = new StudentId();

        studentId.setId( studentIdDTO.getId() );
        studentId.setCode( studentIdDTO.getCode() );

        return studentId;
    }

    protected Course courseDTOToCourse(CourseDTO courseDTO) {
        if ( courseDTO == null ) {
            return null;
        }

        Course course = new Course();

        course.setId( courseDTO.getId() );
        course.setName( courseDTO.getName() );

        return course;
    }

    protected List<Course> courseDTOListToCourseList(List<CourseDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Course> list1 = new ArrayList<Course>( list.size() );
        for ( CourseDTO courseDTO : list ) {
            list1.add( courseDTOToCourse( courseDTO ) );
        }

        return list1;
    }

    protected Adress adressDTOToAdress(AdressDTO adressDTO) {
        if ( adressDTO == null ) {
            return null;
        }

        Adress adress = new Adress();

        adress.setStreet( adressDTO.getStreet() );
        adress.setCity( adressDTO.getCity() );
        adress.setZipCode( adressDTO.getZipCode() );

        return adress;
    }

    protected StudentIdDTO studentIdToStudentIdDTO(StudentId studentId) {
        if ( studentId == null ) {
            return null;
        }

        StudentIdDTO studentIdDTO = new StudentIdDTO();

        studentIdDTO.setId( studentId.getId() );
        studentIdDTO.setCode( studentId.getCode() );

        return studentIdDTO;
    }

    protected CourseDTO courseToCourseDTO(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setId( course.getId() );
        courseDTO.setName( course.getName() );

        return courseDTO;
    }

    protected List<CourseDTO> courseListToCourseDTOList(List<Course> list) {
        if ( list == null ) {
            return null;
        }

        List<CourseDTO> list1 = new ArrayList<CourseDTO>( list.size() );
        for ( Course course : list ) {
            list1.add( courseToCourseDTO( course ) );
        }

        return list1;
    }

    protected AdressDTO adressToAdressDTO(Adress adress) {
        if ( adress == null ) {
            return null;
        }

        AdressDTO adressDTO = new AdressDTO();

        adressDTO.setStreet( adress.getStreet() );
        adressDTO.setCity( adress.getCity() );
        adressDTO.setZipCode( adress.getZipCode() );

        return adressDTO;
    }
}
