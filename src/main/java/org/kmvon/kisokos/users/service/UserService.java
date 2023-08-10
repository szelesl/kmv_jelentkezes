package org.kmvon.kisokos.users.service;

import org.kmvon.kisokos.users.domain.UserBE;
import org.kmvon.kisokos.users.domain.UserDTO;
import org.kmvon.kisokos.users.domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Autowired
    public UserService(UserRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<UserDTO> findAllUsers() {
        final List<UserBE> users = repository.findAll();
        return users.stream().map(mapper::entityToData).collect(Collectors.toList());
    }
}
