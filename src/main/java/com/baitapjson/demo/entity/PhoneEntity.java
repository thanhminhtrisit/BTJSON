package com.baitapjson.demo.entity;

import java.util.List;

public class PhoneEntity {
    private Long id;
    private String name;
    private String brand;
    private double price;
    private double rating;
    private String description;
    private List<String> images;
    private String promotion;
    private String category;

    public PhoneEntity() {
    }

    public PhoneEntity(Long id, String name, String brand, double price, double rating, String description, List<String> images, String promotion, String category) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.rating = rating;
        this.description = description;
        this.images = images;
        this.promotion = promotion;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
