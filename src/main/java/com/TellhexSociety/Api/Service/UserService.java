package com.TellhexSociety.Api.Service;

import com.TellhexSociety.Api.Entity.User;
import com.TellhexSociety.Api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository _repository;

    public User GetUser(long id) {
        return _repository.findById(id);
    }
}
