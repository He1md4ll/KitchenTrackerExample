package com.kitchen.tracker.services;

import com.kitchen.tracker.models.Grocery;
import com.kitchen.tracker.repos.GroceryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Component
public class MainServiceImpl implements MainService {

    @Autowired
    private GroceryDao groceryDao;

    @Transactional
    public void createGrocery(String name, int value) {
        Grocery grocery = new Grocery(name, value);
        groceryDao.save(grocery);
    }
}
