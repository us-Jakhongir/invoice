package com.example.appinvoice.entity;


import com.example.appinvoice.entity.template.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Order order;

    @Column(precision = 8, scale = 2, columnDefinition = "NUMERIC")
    private Double amount;

    @Column(nullable = false)
    private Date issued;

    @Column(nullable = false)
    private Date due;

    public Invoice(Order order, Double amount, Date issued, Date due) {
        this.order = order;
        this.amount = amount;
        this.issued = issued;
        this.due = due;
    }
}
