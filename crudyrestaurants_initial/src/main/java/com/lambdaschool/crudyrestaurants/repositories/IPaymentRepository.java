package com.lambdaschool.crudyrestaurants.repositories;

import com.lambdaschool.crudyrestaurants.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface IPaymentRepository extends CrudRepository<Payment, Long>
{
}
