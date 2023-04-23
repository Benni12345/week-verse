package com.example.weekverse.Week.Verse.repository;
import com.example.weekverse.Week.Verse.model.VerseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface VerseRepository extends JpaRepository<VerseModel, Integer> {
    @Query(value = "SELECT * FROM verse_model LIMIT 1", nativeQuery = true)
    Optional<VerseModel> findLastVerse();
}
