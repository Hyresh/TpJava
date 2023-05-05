package local.services;

import local.entities.StudentEntity;
import local.mappers.MapperStudent;
import local.dtos.StudentDTO;
import local.dtos.StudentIdDTO;
import local.repositories.StudentRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("service1")
public class StudentServiceImpl implements StudentService{

    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository studentRepository;
    private MapperStudent studentMapper = Mappers.getMapper(MapperStudent.class);
   /* public StudentServiceImpl(@Qualifier("repo1") StudentRepository studentRepository, @Qualifier("mapper1") StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.mapper = studentMapper;
    }*/
    public StudentServiceImpl(@Qualifier("repo1") StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public Long save(StudentDTO dto) {
        LOGGER.debug("Start method save => ",dto);
        LOGGER.debug("Mapping DTO to ENTITY",studentMapper.studentDtoToEntity(dto));
        //StudentDTO re = mapper.convertEntitytoDto(studentRepository.save(mapper.convertDtoToEntity(dto)));
        StudentDTO re = studentMapper.studentEntityToDto(studentRepository.save(studentMapper.studentDtoToEntity(dto)));
        return re.getStudentId().getId();
    }

    @Override
    public Long update(StudentDTO dto) {
        LOGGER.debug("start method save  : {} ",dto);
        StudentDTO re = studentMapper.studentEntityToDto(studentRepository.save(studentMapper.studentDtoToEntity(dto)));
        return re.getStudentId().getId();
    }

    /*@Override
    public Boolean delete(StudentIdDTO idDTO){
        return true;
    }*/
    @Override
    public Boolean delete(StudentIdDTO idDto) {
        LOGGER.debug("start method delete  : {} ", idDto);
        studentRepository.deleteById(studentMapper.studentIdDTOToStudentId(idDto));
        return true;
    }

    @Override
    public List<StudentDTO> SelectAll() {
        LOGGER.debug("start method select All");
        LOGGER.debug("the size is :[{}]",studentRepository.findAll().size());
        return studentMapper.studentEntiesToDtos(studentRepository.findAll());
    }
}
