package com.deyweson.learningspringboot.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RequestMapping("/f")
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
    public String queryParams2(@RequestParam Map<String, String> allParams) {
        return "Params: " + allParams.entrySet();
    }

    @PostMapping("/body")
    public String Body(@RequestBody User user){
        return "body: " + user.username;
    }

    @PostMapping("/header")
    public String Header(@RequestHeader("name") String name){
        return "body: " + name;
    }

    @PostMapping("/list-header")
    public String ListHeader(@RequestHeader Map<String, String> header){
        return "body: " + header.entrySet();
    }

    @GetMapping("/response")
    public ResponseEntity<Object> Response() {
    return ResponseEntity.status(400).body("Mensagem de Error");
    }

    record User(String username){}

}
