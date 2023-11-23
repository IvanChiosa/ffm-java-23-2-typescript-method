package com.example.ffmjava232asterixapi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AsterixService {


    private final AsterixRepo repo;

    public List<Character> saveCharacter(List<Character> character) {
     return repo.saveAll(character);
      //return repo.findAll();
    }
}
