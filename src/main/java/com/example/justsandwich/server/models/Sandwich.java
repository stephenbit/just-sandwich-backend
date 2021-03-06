package com.example.justsandwich.server.models;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sandwiches")
public class Sandwich {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDateTime dateAdded;

    @Column
    private Long price;

    @Column
    private int photoId;

    @Column
    private double rating;

    @Column
    private int numberSold;

    public Sandwich(
            String name,
            LocalDateTime dateAdded,
            Long price,
            int photoId,
            double rating,
            int numberSold
    ) {
        this.name = name;
        this.dateAdded = dateAdded;
        this.price = price;
        this.photoId = photoId;
        this.rating = rating;
        this.numberSold = numberSold;
    };

    public Sandwich() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getNumberSold() {
        return numberSold;
    }

    public void setNumberSold(int numberSold) {
        this.numberSold = numberSold;
    }
};