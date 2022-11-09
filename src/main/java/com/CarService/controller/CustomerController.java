package com.CarService.controller;

import com.CarService.dto.CustomerDTO;
import com.CarService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerController {
    private final CustomerService carServiceService;

    @Autowired
    public CustomerController(CustomerService carServiceService) {

        this.carServiceService = carServiceService;
    }


    @PostMapping(value = "/add-new-customer")
    public void createNewCustomer(@RequestBody CustomerDTO customerDTO) {
        carServiceService.createNewCustomer(customerDTO);
    }
}
