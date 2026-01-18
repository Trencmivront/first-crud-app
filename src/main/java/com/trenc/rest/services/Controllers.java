package com.trenc.rest.services;

import com.trenc.rest.models.Users;
import com.trenc.rest.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controllers {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    private String hello(){
        return "Hello";
    }

    @GetMapping(value = "/users")
    private List<Users> getUsers(){
        return userRepo.findAll();
    }

    @GetMapping(value = "/user/{id}")
    private Users getUser(@PathVariable Long id){
        return userRepo.findById(id).get();
    }

    @PostMapping(value = "/create")
    private Boolean createUser(@RequestBody Users users){
        userRepo.save(users);
        return true;
    }

    @PutMapping(value = "/update/user/{id}")
    private String updateUser(@PathVariable Long id, @RequestBody Users users){
        Users users1 = userRepo.findById(id).get();

        users1.setName(users.getName());
        users1.setSurname(users.getSurname());
        users1.setAge(users.getAge());
        users1.setJob(users.getJob());

        userRepo.save(users1);

        return "User updated with id: " + id;
    }

    @DeleteMapping(value = "/delete/user/{id}")
    private String deleteUser(@PathVariable Long id){

        Users users = userRepo.findById(id).get();

        userRepo.delete(users);

        return "User deleted with id: " + id;
    }

}
