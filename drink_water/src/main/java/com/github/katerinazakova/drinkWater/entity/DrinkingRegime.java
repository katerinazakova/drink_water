package com.github.katerinazakova.drinkWater.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
public class DrinkingRegime {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfEntry;
    private LocalTime timeOfEntry;
    private DrinkEnum drink;
    private int quantity;
    private boolean sport;



}
