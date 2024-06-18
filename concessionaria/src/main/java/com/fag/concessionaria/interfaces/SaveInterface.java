package com.fag.concessionaria.interfaces;

import java.util.Map;

public interface SaveInterface<T> {
    void save(T object);
    void update(T object, Long id);
    Map<String, Object> findById(Long id);
}
