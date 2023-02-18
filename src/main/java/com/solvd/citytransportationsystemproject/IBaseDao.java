package com.solvd.citytransportationsystemproject;

public interface IBaseDao<T> {
    T getEntityById(long id);
    void updateEntity(T entity);
    T createEntity(T entity);
    void deleteEntity(long id);
}
