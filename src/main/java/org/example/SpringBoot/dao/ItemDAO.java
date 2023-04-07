package org.example.SpringBoot.dao;

import java.util.List;


public interface ItemDAO<T> {

    public List<T> index();

    public T show(int id);

    public void add(T t);

    public void update(T t);

    public void delete(int id);

}
