package org.technova.service.interfaces;

import org.technova.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User create(User user);

    List<User> findAll();

    void update(User user);

    Optional<User> findById(Long id);

    void delete(User user);
}
