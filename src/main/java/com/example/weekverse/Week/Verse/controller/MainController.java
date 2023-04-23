package com.example.weekverse.Week.Verse.controller;

import com.example.weekverse.Week.Verse.model.VerseModel;
import com.example.weekverse.Week.Verse.repository.VerseRepository;
import com.example.weekverse.Week.Verse.request.VerseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private VerseRepository verseRepository;

    @GetMapping("/verse")
    public ResponseEntity getWeekVerse() throws Exception {
        VerseModel verse = verseRepository.findLastVerse().orElseThrow(() -> new Exception("Failed getting last verse."));
        return ResponseEntity.ok(verse);
    }

    @PutMapping("/verse")
    public ResponseEntity setWeekVerse(@RequestBody VerseModel verse) throws Exception {
        verseRepository.deleteAll();
        VerseModel newVerse = verseRepository.save(verse);

        return ResponseEntity.ok(newVerse);
    }
}
