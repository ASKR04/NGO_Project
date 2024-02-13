package org.example.ngo_project.Services;

import org.example.ngo_project.Repository.UserRepository;
import org.example.ngo_project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    private UserService(UserRepository userRepository){
        this.userRepository =userRepository;
    }
    public User createUser(User user){
        return userRepository.save(user);
    }
    public Optional<User> getUserById(Long userId){
        return userRepository.findById(userId);
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }
}

