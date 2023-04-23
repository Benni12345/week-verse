package com.example.weekverse.Week.Verse.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
public class VerseModel {
    @Id
    @GeneratedValue
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    private String verse;
    private String passage;

    public VerseModel() {

    }

    public VerseModel(String verse, String passage) {
        super();
        this.verse = verse;
        this.passage = passage;
    }
}