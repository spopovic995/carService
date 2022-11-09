package com.CarService.service.impl;

import com.CarService.domain.Contact;
import com.CarService.domain.Customer;
import com.CarService.dto.CustomerDTO;
import com.CarService.repository.CustomerRepository;
import com.CarService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    public void createNewCustomer(CustomerDTO customerDTO) {

        Contact contact = Contact.builder()
                .email(customerDTO.getEmail())
                .address(customerDTO.getAddress())
                .mobileNumber(customerDTO.getMobileNumber())
                .build();

        Customer customer = Customer.builder()
                .name(customerDTO.getName())
                .surname(customerDTO.getSurname())
                .contact(contact)
                .vehicles(customerDTO.getVehicles())
                .build();

        for (int i = 0; i < customerDTO.getVehicles().size(); i++) {
            customerDTO.getVehicles().get(i).setOwner(customer);
        }

        customerRepository.save(customer);
    }
}
