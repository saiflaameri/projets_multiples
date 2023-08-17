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
@Getter
@Setter
@ToString
@AllArgsConstructor
@Table(name="visite")
public class visite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idvisite;

    @Temporal(TemporalType.DATE)
    private Date datevisite;

    @Temporal(TemporalType.TIME)
    private Date heurevisite;

    private float kilometrageactuelle;
    @Temporal(TemporalType.TIMESTAMP)
    private Date prochainrendez;

    @OneToOne()
    private vehicule vehicule;


    public visite (){}
}
