package com.example.devcrew.entities;

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
@Table(name="vignette")
public class vignette implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idvignette;

    @Temporal(TemporalType.DATE)
    private Date datefin;
    private boolean etat;


    @OneToOne()
    private vehicule vehicule;



    public vignette(){

}
}
