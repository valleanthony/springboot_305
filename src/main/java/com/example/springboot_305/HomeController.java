package com.example.springboot_305;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeController {

    @Autowired
    ActorsRepo actorsRepo;

    @Autowired
    MoviesRepo moviesRepo;

    @RequestMapping("/")
    public String index(Model model){
       //New instance of an actor
        Actors actor = new Actors();
        actor.setName("Sandra Bullock");
        actor.setRealName("Sandra Annette Bullock");

        //new instance of a movie
        Movies movie = new Movies();
        movie.setTitle("Blind side");
        movie.setYear(2011);
        movie.setDescription("A football movie");

        //Adding the movie to an empty list
        Set<Movies> allmymovies = new HashSet<Movies>();
        allmymovies.add(movie);


        //




    }



}
