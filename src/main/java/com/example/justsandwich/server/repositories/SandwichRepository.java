package com.example.justsandwich.server.repositories;

import com.example.justsandwich.server.models.Sandwich;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface SandwichRepository extends JpaRepository<Sandwich, Long> {

}
