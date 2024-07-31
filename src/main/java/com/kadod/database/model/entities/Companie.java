package com.kadod.database.model.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "companies")
public class Companie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "code")
    private String code;
    @Column(name = "logo")
    private String logo;
    @JoinColumn(name = "companies_type_id", referencedColumnName = "id")
    @ManyToOne
    private CompanieType type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public CompanieType getType() {
        return type;
    }

    public void setType(CompanieType type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
