package com.deyweson.learningspringboot.controller;


import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RequestMapping("/")
@RestController
public class FirstController {

    @GetMapping("/{id}")
    public String firstMethod(@PathVariable(name = "id") String id) {
        return "ID: " + id;
    }

    @GetMapping("/query")
    public  String queryParams(@RequestParam String id) {
        return "ID: " + id;
    }

    @GetMapping("/query2")
    public  String queryParams2(@RequestParam Map<String, String> allParams) {
        return "Params: " + allParams.entrySet();
    }
}
