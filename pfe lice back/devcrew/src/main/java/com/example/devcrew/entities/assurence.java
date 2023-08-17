package com.example.devcrew.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@Table(name="assurence")
public class assurence implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idassurence;

    private String typeaasurence;
    private float tarifbase;
    private float tauxreduction;
    private String tyhpevehicule;
    @Temporal(TemporalType.DATE)
    private Date datedebut;

    @Temporal(TemporalType.DATE)
    private Date datefin;
    private boolean etat;


    @OneToOne()
    private vehicule vehicule;




    public assurence(){

    }

}
