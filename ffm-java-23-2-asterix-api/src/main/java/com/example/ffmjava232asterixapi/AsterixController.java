package com.example.ffmjava232asterixapi;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@RestController
@RequestMapping("/asterix")
public class AsterixController {

    private List<Character> characterList = new ArrayList<>();
    private final AsterixService service;

    @GetMapping("/characters")
    public List<Character> getCharacterList() {
        return List.of(
                new Character("1", "Asterix", 35, "Krieger"),
                new Character("2", "Obelix", 35, "Lieferant"),
                new Character("3", "Miraculix", 60, "Druide"),
                new Character("4", "Majestix", 60, "Häuptling"),
                new Character("5", "Troubadix", 25, "Barden"),
                new Character("6", "Gutemine", 35, "Häuptlingsfrau"),
                new Character("7", "Idefix", 5, "Hund"),
                new Character("8", "Geriatrix", 70, "Rentner"),
                new Character("9", "Automatix", 35, "Schmied"),
                new Character("10", "Grockelix", 35, "Fischer")
        );
    }

    // Endpoint to add a new character
    @PostMapping("/characters")
    public List<Character> addCharacter(@RequestBody ArrayList<Character> newCharacter) {
        characterList.addAll(newCharacter);
        return characterList;
    }
    @PostMapping
    public List<Character> saveCharacter(@RequestBody List<Character> character) {
        return service.saveCharacter(character);
    }
}



