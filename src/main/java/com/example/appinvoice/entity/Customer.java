package com.example.appinvoice.entity;


import com.example.appinvoice.entity.template.CharConvertor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import com.example.appinvoice.entity.template.AbstractEntity;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 250)
    private String name;


    @Column(nullable = false, columnDefinition = "CHAR", length = 250)
    @Convert(converter = CharConvertor.class)
    private String country;


    private String address;

    @Column(length = 50)
    private String phone;


}
