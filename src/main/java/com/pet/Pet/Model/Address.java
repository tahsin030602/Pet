package com.pet.Pet.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String zipcode;
    private String city;
    private String state;
    private String country;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
    private Set<Pet> pets = new HashSet<>();

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
    private Set<Users>  users = new HashSet<>();

    public Address orElse(Object o) {
        return null;
    }
}
