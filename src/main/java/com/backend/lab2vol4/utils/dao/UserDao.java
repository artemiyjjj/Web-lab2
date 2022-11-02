package com.backend.lab2vol4.utils.dao;

import com.backend.lab2vol4.entities.user.User;

import java.util.List;
import java.util.Optional;

public class UserDao implements Dao<User> {

    @Override
    public Optional<User> get(long id) {
        return Optional.empty();
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user, List params) {

    }
}
