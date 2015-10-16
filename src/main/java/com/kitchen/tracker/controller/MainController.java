package com.kitchen.tracker.controller;

import com.kitchen.tracker.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private MainService mainServiceImpl;

    @RequestMapping("/")
    @Transactional(readOnly = true)
    public ModelAndView index() {
        mainServiceImpl.createGrocery("Test", 12);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("name", "Test");
        return modelAndView;
    }
}
