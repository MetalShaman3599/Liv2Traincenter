package com.seinpiper.backend_livtwotrain.livetwotrain.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ADDRESS_TBL")
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int address_id;
    private String road;
    private String city;
    private String state;
    private int pincode;
}
