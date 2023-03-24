package local.repositories;


import local.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class StudentRepositoryImpl implements StudentRepository {

    private final static Logger LOGGER = LoggerFactory.getLogger(StudentRepositoryImpl.class);
    @Override
    public StudentEntity save(StudentEntity entity) {
        LOGGER.debug("Start Method SAVE");
        return null;
    }

    @Override
    public StudentEntity update(StudentEntity entity) {
        LOGGER.debug("Start Method UPDATE");
        return null;
    }

    @Override
    public boolean delete(long id) {
        LOGGER.debug("Start Method DELETE");
        return false;
    }

    @Override
    public List<StudentEntity> selectAll() {
        LOGGER.debug("Start Method SELECT");
        return null;
    }
}
