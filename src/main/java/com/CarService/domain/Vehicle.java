package com.CarService.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "engine_number")
    private String engineNumber;

    @Column(name = "chassis_number")
    private String chassisNumber;

    @Column(name = "colour")
    private String colour;

    @Column(name = "year_of_manufacturing")
    private int yearOfManufacturing;

//    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Customer owner;
}
