package com.CarService.dto;

import com.CarService.domain.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private String name;

    private String surname;

    private String address;

    private String email;

    private int mobileNumber;

//    private String registrationNumber;
//
//    private String carModel;
//
//    private String engineNumber;
//
//    private String chassisNumber;
//
//    private String colour;
//
//    private int yearOfManufacturing;

    private List<Vehicle> vehicles;

}
