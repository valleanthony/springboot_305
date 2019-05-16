package com.example.springboot_305;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Actors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String realName;
    @ManyToMany(mappedBy = "cast")
    private Set<Movies> movies;

    public Actors() {
    }

    public Actors(String name, String realName, Set<Movies> movies) {
        this.name = name;
        this.realName = realName;
        this.movies = movies;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Set<Movies> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movies> movies) {
        this.movies = movies;
    }


}
