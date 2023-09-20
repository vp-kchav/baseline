package com.intuit.playerdb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Baseline")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Baseline  implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "playerID")
    private String playerID;

    @Column(name = "BIRTHYEAR")
    private String birthYear;

    @Column(name = "BIRTHMONTH")
    private String birthMonth;

    @Column(name = "BIRTHDAY")
    private String birthDay;

    @Column(name = "BIRTHCOUNTRY")
    private String birthCountry;

    @Column(name = "BIRTHSTATE")
    private String birthState;

    @Column(name = "BIRTHCITY")
    private String birthCity;
}
