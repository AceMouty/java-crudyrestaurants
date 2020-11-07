package com.lambdaschool.crudyrestaurants.services;


import com.lambdaschool.crudyrestaurants.models.Payment;
import com.lambdaschool.crudyrestaurants.repositories.IPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "paymentService") // name our service, tip: value is something that we as the programmer will actaully be using
public class PaymentServiceImpl implements IPaymentService
{
    @Autowired
    IPaymentRepository paymentRepository;

    @Override
    public Payment save(Payment payment)
    {
        return paymentRepository.save(payment);
    }
}
