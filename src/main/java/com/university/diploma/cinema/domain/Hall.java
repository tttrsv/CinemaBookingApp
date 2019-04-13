package com.university.diploma.cinema.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@AttributeOverride(name = "id", column = @Column(name = "hall_id"))
public class Hall extends BaseEntity {

    private String title;

    private String description;

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @OneToMany(mappedBy = "hall")
    private Set<Row> rows;

    @OneToMany(mappedBy = "hall")
    private Set<MovieSession> movieSessions;
}
