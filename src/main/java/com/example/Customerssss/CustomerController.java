package com.example.Customerssss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerRep repo;

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer){
        repo.save(customer);
        return customer;
    }
}
