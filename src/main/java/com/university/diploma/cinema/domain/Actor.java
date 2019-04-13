package com.university.diploma.cinema.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@AttributeOverride(name = "id", column = @Column(name = "actor_id"))

public class Actor extends BaseEntity {
    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "actor_id"),
    inverseJoinColumns = @JoinColumn(name = "film_id"))
    private Set<Movie> movies;
}
