package com.baitapjson.demo.entity;

import java.util.List;

public class CameraEntity {
    private Long id;
    private String name;
    private String brand;
    private double price;
    private String imageUrl;
    private double rating;
    private String shortDescription;
    private double discount;
    private String category;

    public CameraEntity() {
    }

    public CameraEntity(Long id, String name, String brand, double price, String imageUrl, double rating, String shortDescription, double discount, String category) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.imageUrl = imageUrl;
        this.rating = rating;
        this.shortDescription = shortDescription;
        this.discount = discount;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
