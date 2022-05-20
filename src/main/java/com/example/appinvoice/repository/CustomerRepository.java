package com.example.appinvoice.repository;

import com.example.appinvoice.controller.CustomerController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerController, Integer> {

    @Query(value = "select c.id, c.name, c.country, c.address, c.phone from customer c join orders o on c.id = o.cust_id " +
    "where (select count(*) from orders where orders.date BETWEEN ?1 AND ?2) = 0", nativeQuery = true)
    List<CustomerController> getAllWithoutOrders(String start, String finish);

}
