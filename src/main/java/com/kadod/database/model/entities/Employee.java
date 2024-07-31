package com.kadod.database.model.entities;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "email")
    private String email;
    @Column(name = "fonction")
    private String fonction;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne
    private User user;
    @JoinColumn(name = "companies_id", referencedColumnName = "id")
    @ManyToOne
    private Companie companie;
    @JoinColumn(name = "enrollInfo_id", referencedColumnName = "id")
    @ManyToOne
    private EnrollInfo enrollInfo;
    @Column(name = "pin")
    private String pin;
    @Column(name = "salt")
    private String salt;
    @Column(name = "isAdmin")
    private Boolean isAdmin;
    @Column(name = "profile")
    private String profile;
    @Lob
    @Type(type = "org.hibernate.type.ImageType")
    private byte[] imageData;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @JoinColumn(name = "employee_admin_id", referencedColumnName = "id")
    @ManyToOne
    private Employee employeeAdmin;

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Companie getCompanie() {
        return companie;
    }

    public void setCompanie(Companie companie) {
        this.companie = companie;
    }

    public EnrollInfo getEnrollInfo() {
        return enrollInfo;
    }

    public void setEnrollInfo(EnrollInfo enrollInfo) {
        this.enrollInfo = enrollInfo;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Employee getEmployeeAdmin() {
        return employeeAdmin;
    }

    public void setEmployeeAdmin(Employee employeeAdmin) {
        this.employeeAdmin = employeeAdmin;
    }
}
