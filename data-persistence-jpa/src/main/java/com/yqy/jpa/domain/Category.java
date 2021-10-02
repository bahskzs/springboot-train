package com.yqy.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "category")
@Entity
public class Category {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "parent", nullable = false)
    private Long parent;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "sort")
    private Integer sort;

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
