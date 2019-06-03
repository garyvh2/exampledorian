package com.gary.cr.exampledorian.service;

import com.gary.cr.exampledorian.domain.User;
import com.gary.cr.exampledorian.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Transactional
    public User insert(User user) { return this.userRepository.save(user); }

    @Transactional
    public User update(User user) {
        Optional<User> presentUser = this.userRepository.findById(user.getId());
        if (presentUser.isPresent()) {
            return this.userRepository.save(user);
        } else {
            throw new Error("User not found");
        }
    }
}
