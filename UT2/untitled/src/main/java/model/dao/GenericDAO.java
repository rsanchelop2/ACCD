package model.dao;

import java.util.List;

public interface GenericDAO<T, ID> {

    void save(T entity) throws Exception;

    default void create(T entity) throws Exception {
        save(entity);
    }

    T findById(ID id);

    List<T> findAll();

    void update(T entity) throws Exception;

    void delete(T entity) throws Exception;
}
