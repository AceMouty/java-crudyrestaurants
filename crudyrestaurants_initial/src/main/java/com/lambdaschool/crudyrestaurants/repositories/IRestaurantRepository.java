package com.lambdaschool.crudyrestaurants.repositories;

import com.lambdaschool.crudyrestaurants.models.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface IRestaurantRepository extends CrudRepository<Restaurant, Long>
{
}
