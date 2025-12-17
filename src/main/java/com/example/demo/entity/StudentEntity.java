package com.example.demo.entity;

import jakarta.persistance.Entity;
import jakarta.persistance.GeneratedValue;
import jakarta.persistance.GenerationType;
import jakarta.persistance.Id;

@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;
}