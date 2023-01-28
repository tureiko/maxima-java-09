package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cats")
public class Cat {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "imya")
    private String name;
    @Column(name = "angry")
    private boolean isAngry;
    @Column(name = "ves")
    private int weight;

    public Cat(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    protected Cat() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean isAngry) {
        this.isAngry = isAngry;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", isAngry=" + isAngry +
                '}';
    }
}
