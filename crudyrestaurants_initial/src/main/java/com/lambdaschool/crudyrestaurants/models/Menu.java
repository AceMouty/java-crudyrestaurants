package com.lambdaschool.crudyrestaurants.models;

import javax.persistence.*;

@Entity
@Table (name = "menus")
public class Menu
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long menuid;

    @Column(nullable = false) // Dont allow a dish to be null in the DB
    private String dish;
    private double price;

    // Data model: Connect Menu to Restaurant
    @ManyToOne
    @JoinColumn(name = "restaurantid", nullable = false) // connect every menu item to a restaurant and dont allow nuls
    private Restaurant restaurant;

    // JPA Default constructor
    public Menu(){}

    public Menu(String dish, double price, Restaurant restaurant)
    {
        this.dish = dish;
        this.price = price;
        this.restaurant = restaurant;
    }

    public long getMenuid()
    {
        return menuid;
    }

    public void setMenuid(long menuid)
    {
        this.menuid = menuid;
    }

    public String getDish()
    {
        return dish;
    }

    public void setDish(String dish)
    {
        this.dish = dish;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public Restaurant getRestaurant()
    {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant)
    {
        this.restaurant = restaurant;
    }
}
