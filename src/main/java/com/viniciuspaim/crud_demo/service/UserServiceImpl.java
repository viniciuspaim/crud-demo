package com.viniciuspaim.crud_demo.service;

import com.viniciuspaim.crud_demo.dto.UserDTO;
import com.viniciuspaim.crud_demo.model.User;
import com.viniciuspaim.crud_demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Override
    public User save(UserDTO userDTO) {
        User user = new User(userDTO.getEmail(), userDTO.getPassword(), userDTO.getRole(), userDTO.getFullName());
        return userRepository.save(user);
    }
}
