package com.university.diploma.cinema.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@AttributeOverride(name = "id", column = @Column(name = "cinema_id"))

public class Cinema extends BaseEntity{

    private String title;
    private String address;
    private String phone;
    private String email;

    @OneToMany(mappedBy = "cinema")
    private Set<Hall> halls;
}
