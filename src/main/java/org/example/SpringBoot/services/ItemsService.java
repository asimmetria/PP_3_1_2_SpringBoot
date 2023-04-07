package org.example.SpringBoot.services;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ItemsService<T> {
    public List<T> index();

    public T show(int id);
    @Transactional
    public void add(T t);
    @Transactional
    public void update(T t);
    @Transactional
    public void delete(int id);

}
