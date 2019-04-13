package com.university.diploma.cinema.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@AttributeOverride(name = "id", column = @Column(name = "genre_id"))
public class Genre extends BaseEntity {

    private String title;
    private String description;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "genre_id"),
    inverseJoinColumns = @JoinColumn(name= "movie_id"))
    private Set<Movie> movies;
}
