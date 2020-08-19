package com.gurjar.chaman.cgrecipeproject.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 18-Aug-2020
 */

@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
