package com.viniciuspaim.crud_demo.service;

import com.viniciuspaim.crud_demo.dto.UserDTO;
import com.viniciuspaim.crud_demo.model.User;

public interface UserService {

    User save(UserDTO userDTO);
}
