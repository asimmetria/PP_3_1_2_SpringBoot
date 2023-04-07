package org.example.SpringBoot.dao;

import java.util.List;


public interface ItemDAO<T> {

    List<T> index();

    T show(int id);

    void add(T t);

    void update(T t);

    void delete(int id);

}
