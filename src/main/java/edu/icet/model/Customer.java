package edu.icet.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    private String id;
    private String name;
    private String email;
    private String address;
    private double balance;
}
