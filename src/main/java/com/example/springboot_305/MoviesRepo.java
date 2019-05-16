package com.example.springboot_305;

import org.springframework.data.repository.CrudRepository;

public interface MoviesRepo extends CrudRepository<Movies, Long> {
}
