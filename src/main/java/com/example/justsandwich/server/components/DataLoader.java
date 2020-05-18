package com.example.justsandwich.server.components;

import com.example.justsandwich.server.models.Sandwich;
import com.example.justsandwich.server.repositories.SandwichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    SandwichRepository sandwichRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        SimpleDateFormat date1 =
                new SimpleDateFormat ("2020.05.13 10:47:00");

        Sandwich sandwich1 = new Sandwich(
                "Just Egg Mayonnaise",
                date1,
                4.99,
                00000001,
                5,
                100
        );

        Sandwich sandwich2 = new Sandwich(
                "Just Cheese",
                date1,
                4.99,
                00000002,
                4.5,
                100
        );

        Sandwich sandwich3 = new Sandwich(
                "Just Coronation Chicken",
                date1,
                4.99,
                00000003,
                3.9,
                100
        );

        Sandwich sandwich4 = new Sandwich(
                "Just Salad",
                date1,
                4.99,
                00000004,
                5,
                100
        );

        Sandwich sandwich5 = new Sandwich(
                "Just Ham",
                date1,
                4.99,
                00000005,
                4.1,
                100
        );

        Sandwich sandwich6 = new Sandwich(
                "Just BLT",
                date1,
                4.99,
                00000006,
                4,
                100
        );
        sandwichRepository.save(sandwich1);
        sandwichRepository.save(sandwich2);
        sandwichRepository.save(sandwich3);
        sandwichRepository.save(sandwich4);
        sandwichRepository.save(sandwich5);
        sandwichRepository.save(sandwich6);






    }
}
