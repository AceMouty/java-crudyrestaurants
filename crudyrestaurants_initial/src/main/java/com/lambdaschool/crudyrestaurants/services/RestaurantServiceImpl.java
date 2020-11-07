package com.lambdaschool.crudyrestaurants.services;

import com.lambdaschool.crudyrestaurants.models.Restaurant;
import com.lambdaschool.crudyrestaurants.repositories.IRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "restaurantService") // name our service
public class RestaurantServiceImpl implements IRestaurantService
{
    @Autowired
    IRestaurantRepository restrepo;

    @Override
    public Restaurant save(Restaurant restaurant)
    {
        // Allow JPA to save the restaurant, any relationships to payments data and any related menu items.
        return restrepo.save(restaurant);
    }
}
