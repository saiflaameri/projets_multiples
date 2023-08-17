package com.example.devcrew.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter

@AllArgsConstructor
@ToString
@Table ( name ="event")
public class event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idevent;
    private String nom;
    private String adresse;
    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToMany(mappedBy = "event",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    private List<equipement> equipements;

    public event(){

     }



}
