package com.kitchen.tracker.repos;

import com.kitchen.tracker.models.Grocery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryDao extends CrudRepository<Grocery, Long> {
    public Grocery findByName(String name);
}
