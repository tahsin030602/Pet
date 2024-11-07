package com.pet.Pet.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.firebase.database.annotations.NotNull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    @NotNull
    private String username;
    @NotNull
    private String name;
    @Column(length = 1000)
    private String bio;
    @NotNull
    @Column(unique = true)
    private String email;
    private String phone;
    @Column(length = 1000)
    @JsonIgnore
    private String password;
    private String profilePic;
    private String coverPic;
    private String role;
    private String dob;
    @JsonIgnore
    private String OTP;
    @JsonIgnore
    private Long ExpireTimeOfOtp;
    @JsonIgnore
    private boolean enable;
    private int reportCount;
    private Long reportedTill;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address", referencedColumnName = "id")
    private Address address;

    @JsonIgnore
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private Set<Pet> pets = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "requestUsers", cascade = CascadeType.ALL)
    private Set<AdoptionRequest> adoptionRequests = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "userFrom",cascade = CascadeType.ALL)
    private Set<Comment> comments = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "reportBy",cascade = CascadeType.ALL)
    private Set<Report> reported = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "reviewBy",cascade = CascadeType.ALL)
    private Set<Report> reviewed = new HashSet<>();
}
