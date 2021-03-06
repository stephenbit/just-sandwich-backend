package com.example.justsandwich.server.components;

import com.example.justsandwich.server.models.Sandwich;
import com.example.justsandwich.server.repositories.SandwichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

 import java.time.LocalDateTime;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    SandwichRepository sandwichRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        LocalDateTime date1 = LocalDateTime.parse("2020-05-13T10:47:00");

        Sandwich sandwich1 = new Sandwich(
                "Just Egg Mayonnaise",
                date1,
                499L,
                1,
                5,
                100
        );

        Sandwich sandwich2 = new Sandwich(
                "Just Cheese",
                date1,
                499L,
                2,
                4.5,
                100
        );

        Sandwich sandwich3 = new Sandwich(
                "Just Coronation Chicken",
                date1,
                499L,
                3,
                3.9,
                100
        );

        Sandwich sandwich4 = new Sandwich(
                "Just Salad",
                date1,
                499L,
                4,
                5,
                100
        );

        Sandwich sandwich5 = new Sandwich(
                "Just Ham",
                date1,
                499L,
                5,
                4.1,
                100
        );

        Sandwich sandwich6 = new Sandwich(
                "Just BLT",
                date1,
                499L,
                6,
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
