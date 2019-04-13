package com.university.diploma.cinema.domain;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.*;

@Value
@Embeddable
class Seat{

    @ManyToOne
    @JoinColumn(name = "row_id")
    private Row row;

    private Integer seat;
}
