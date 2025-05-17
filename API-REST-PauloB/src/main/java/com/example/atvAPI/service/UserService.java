package com.example.atvAPI.service;

import com.example.atvAPI.model.User;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    private final Map<Long, User> userList = new HashMap<>();
    private final AtomicLong idCounter = new AtomicLong(0);

    public User createUser(User user) {
        Long newId = idCounter.incrementAndGet();
        User newUser = new User(newId, user.getNome(), user.getIdade());
        userList.put(newUser.getId(), newUser);
        return newUser;
    }

    public List<User> getUserList() {
        return new ArrayList<>(userList.values());
    }

    public User attUser(Long id, User user) {
        if (!userList.containsKey(id)) return null;
        user.setId(id);
        userList.put(id, user);
        return user;
    }

    public void removeUser(Long id) {
        userList.remove(id);
    }
}