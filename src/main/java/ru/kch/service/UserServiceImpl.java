package ru.kch.service;

import org.springframework.stereotype.Service;
import ru.kch.dao.UserDao;
import ru.kch.model.User;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void createUser(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteById(user.getId());
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
