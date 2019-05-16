package com.example.springboot_305;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private long year;
    private String description;

    @ManyToMany
    private Set <Actors> cast;

    public Movies() {
    }

    public Movies(String title, long year, String description, Set<Actors> cast) {
        this.title = title;
        this.year = year;
        this.description = description;
        this.cast = cast;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Actors> getCast() {
        return cast;
    }

    public void setCast(Set<Actors> cast) {
        this.cast = cast;
    }

}
