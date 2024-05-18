package com.hmzadev.projetlocation.dao.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;
    private Date created_at;
    private Date update_at;
    private String name;
    private String description;
    @ManyToMany(mappedBy = "categories", fetch = FetchType.EAGER)
    private Collection<Property> properties = new ArrayList<>();
}
