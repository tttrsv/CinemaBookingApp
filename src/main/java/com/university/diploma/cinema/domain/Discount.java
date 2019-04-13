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
@AttributeOverride(name = "id", column = @Column(name = "discount_id"))
public class Discount extends BaseEntity {

    private String title;

    private String description;

    private int percent;

    @OneToMany(mappedBy = "discount")
    private Set<User> users;
}
