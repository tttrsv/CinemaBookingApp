package com.university.diploma.cinema.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@AttributeOverride(name = "id", column = @Column(name = "ticket_id"))
public class Ticket extends BaseEntity {

    @Embedded
    private Seat seat;

    private Integer price;

    @ManyToOne
    @JoinColumn(name = "movie_session_id")
    private MovieSession movieSession;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
