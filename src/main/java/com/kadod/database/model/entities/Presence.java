package com.kadod.database.model.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "presences")
public class Presence implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    @ManyToOne
    private User user;
    @JoinColumn(name = "record_id", referencedColumnName = "id")
    @ManyToOne
    private Records record;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Records getRecord() {
        return record;
    }

    public void setRecord(Records record) {
        this.record = record;
    }
}
