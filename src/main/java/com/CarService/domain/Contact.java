package com.CarService.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "contact")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contact {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile_number")
    private int mobileNumber;
}
