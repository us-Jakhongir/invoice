package com.example.appinvoice.entity;


import com.example.appinvoice.entity.template.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Payment extends AbstractEntity {

    @Column(nullable = false, updatable = false)
    // @CreationTimestamp
    private Timestamp time;


    @Column(precision = 8, scale = 2, columnDefinition = "NUMERIC")
    private Double amount;



}
