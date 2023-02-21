package com.villoldo.api.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "category")
@Data @NoArgsConstructor @AllArgsConstructor

public class Category {
    @Id @GeneratedValue
    private Integer id;
    private String category_name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_category")
    private List<Product>products;
}
