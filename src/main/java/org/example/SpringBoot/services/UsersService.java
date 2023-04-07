package org.example.SpringBoot.services;

import org.example.SpringBoot.dao.ItemDAO;
import org.example.SpringBoot.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService implements ItemsService<User> {
    private final ItemDAO<User> userDAO;

    @Autowired
    public UsersService(ItemDAO<User> userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> index() {
        return userDAO.index();
    }

    public User show(int id) {
        return userDAO.show(id);
    }


    public void add(User user) {
        userDAO.add(user);
    }


    public void update(User user) {
        userDAO.update(user);
    }


    public void delete(int id) {
        userDAO.delete(id);
    }
}
