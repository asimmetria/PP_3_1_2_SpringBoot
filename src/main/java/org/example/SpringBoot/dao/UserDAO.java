package org.example.SpringBoot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.example.SpringBoot.models.User;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserDAO implements ItemDAO<User>  {
    @PersistenceContext
    private EntityManager entityManager;

    public List<User> index() {
        TypedQuery<User> query = entityManager.createQuery("from User", User.class);
        return query.getResultList();
    }

    public User show(int id) {
        return entityManager.find(User.class, id);
    }

    public void add(User user) {
        entityManager.persist(user);
    }

    public void update(User user) {
        entityManager.merge(user);
    }

    public void delete(int id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }
}