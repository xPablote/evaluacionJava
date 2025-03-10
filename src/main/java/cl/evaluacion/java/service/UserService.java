package cl.evaluacion.java.service;

import cl.evaluacion.java.dto.UserDto;
import cl.evaluacion.java.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User createUser(UserDto userDto);
    User getUserByEmail(String email);
}
