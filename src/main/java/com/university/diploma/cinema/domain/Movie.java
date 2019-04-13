package com.university.diploma.cinema.domain;


import lombok.*;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@AttributeOverride(name = "id", column = @Column(name = "movie_id"))
@Entity
public class Movie extends BaseEntity{

    private String title;
    private int duration;
    private String description;
    private String year;
    private String country;
    private int restriction;
    private LocalDate startFrom;

    @ManyToMany(mappedBy = "movies")
    private Set<Actor> actors;

    @ManyToMany(mappedBy = "movies")
    private Set<Genre> genres;


}
