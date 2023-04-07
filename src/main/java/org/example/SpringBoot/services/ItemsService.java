package org.example.SpringBoot.services;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ItemsService<T> {
    List<T> index();

    T show(int id);

    @Transactional
    void add(T t);

    @Transactional
    void update(T t);

    @Transactional
    void delete(int id);

}
