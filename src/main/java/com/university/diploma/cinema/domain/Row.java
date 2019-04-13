package com.university.diploma.cinema.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@AttributeOverride(name = "id", column = @Column(name = "row_id"))
public class Row extends BaseEntity{

    private int rowIndex;

    private int seats;

    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;
}
