package org.technova.service.implementation;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.technova.model.User;
import org.technova.repository.UserRepository;
import org.technova.service.interfaces.UserService;

import java.util.List;
import java.util.Optional;

@Transactional
@RequiredArgsConstructor
@Service
@Setter
public class UserServiceImp implements UserService {

    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        Optional<User> user = findById(id);
        user.ifPresent(userRepository::delete);
    }
}
