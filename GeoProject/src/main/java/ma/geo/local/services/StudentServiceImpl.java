package ma.geo.local.services;

import ma.geo.local.dtos.StudentDTO;
import ma.geo.local.entities.StudentEntity;
import ma.geo.local.mappers.StudentMapper;
import ma.geo.local.repositories.StudentRepository;
import ma.geo.local.repositories.StudentRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StudentServiceImpl implements StudentService{

    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentMapper mapper;
    @Override
    public StudentDTO save(StudentDTO dto) {
        LOGGER.debug("Start save");
        return mapper.convertEntitytoDto(studentRepository.save(mapper.convertDtoToEntity(dto)));
    }

    @Override
    public StudentDTO update(StudentDTO dto) {
        LOGGER.debug("Start update");
        return mapper.convertEntitytoDto(studentRepository.update(mapper.convertDtoToEntity(dto)));
    }

    @Override
    public boolean delete(long id) {
        LOGGER.debug("Start delete");
        return studentRepository.delete(id);
    }

    @Override
    public List<StudentDTO> SelectAll() {
        LOGGER.debug("Start select");
        return mapper.convertEntitiesToDtos(studentRepository.selectAll());
    }
}
