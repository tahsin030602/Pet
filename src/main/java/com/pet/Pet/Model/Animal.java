package com.pet.Pet.Model;

import com.google.firebase.database.annotations.NotNull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL)
    private List<Category> categories;

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL)
    private List<Pet> pets;
}
