package com.example.test.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Created by Ashot Simonyan on 21.05.23.
 */

@Entity
@Data
@Table(name = "deliveries")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private Order order;
}
