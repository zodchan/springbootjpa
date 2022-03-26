package com.example.demoapp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table(name = "Number",schema = "jpademo")
@Table
public class NumberEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column
    int id;

    @Column
    int a;

    @Column
    int b;

    @Column
    int result;







}
