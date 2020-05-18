package com.example.justsandwich.server.controllers;

import com.example.justsandwich.server.repositories.SandwichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sandwiches")
public class SandwichesController {
    @Autowired
    SandwichRepository sandwichRepository;
}
