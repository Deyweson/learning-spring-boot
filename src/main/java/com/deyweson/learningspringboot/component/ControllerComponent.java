package com.deyweson.learningspringboot.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/c")
public class ControllerComponent {

    @Autowired
    Component component;

    @GetMapping("/")
    public String Chamar() {
        return component.chamarComponent();
    }

}
