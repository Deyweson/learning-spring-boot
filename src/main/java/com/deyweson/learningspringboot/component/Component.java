package com.deyweson.learningspringboot.component;


import org.springframework.stereotype.Service;

@Service
public class Component {
    public String chamarComponent() {
        return "Chamou component";
    }
}
