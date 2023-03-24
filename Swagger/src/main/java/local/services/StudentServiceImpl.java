package local.services;

import local.dtos.StudentDTO;
import local.mappers.StudentMapper;
import local.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{

    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository studentRepository;
    private StudentMapper mapper;
    public StudentServiceImpl( StudentRepository studentRepository,  StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.mapper = studentMapper;
    }
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
