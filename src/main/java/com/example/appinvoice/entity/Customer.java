package com.example.appinvoice.entity;


import com.example.appinvoice.entity.template.CharConvertor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import com.example.appinvoice.entity.template.AbstractEntity;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer extends AbstractEntity{

    @Column(nullable = false, length = 250)
    private String name;


    @Column(nullable = false, columnDefinition = "CHAR", length = 250)
    @Convert(converter = CharConvertor.class)
    private String country;


    private String address;

    @Column(length = 50)
    private String phone;


}
