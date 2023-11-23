package com.example.ffmjava232asterixapi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AsterixRepo  extends MongoRepository<Character, String> {
    public Optional<Character> findByName(String name);
}
