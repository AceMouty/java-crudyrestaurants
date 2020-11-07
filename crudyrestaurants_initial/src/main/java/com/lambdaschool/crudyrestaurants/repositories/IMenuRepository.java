package com.lambdaschool.crudyrestaurants.repositories;

import com.lambdaschool.crudyrestaurants.models.Menu;
import org.springframework.data.repository.CrudRepository;

public interface IMenuRepository extends CrudRepository<Menu, Long>
{
}
