package com.denis.crudapplication.Users;

import com.fasterxml.jackson.annotation.OptBoolean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private UsersRepository userRepository;

    public List<Users> getAllUsers() {
        int page = 0;
        int size =10;
        Pageable pageable = PageRequest.of(page, size, Sort.by("id").ascending());
        List<Users> users =  userRepository.findAll();
        return users;
    }

    public Users getSpecificUser(int id) {
        Users user = new Users();
        user =  userRepository.findById(id).get();
        return user;
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public Users insertUser(Users user) {
        userRepository.save(user);
        return user;
    }

    public void editUser(Users user) {
        userRepository.save(user);
    }
}
