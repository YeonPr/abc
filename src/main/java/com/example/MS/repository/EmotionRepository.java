package com.example.MS.repository;

import com.example.MS.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmotionRepository extends JpaRepository<Emotion, Long> {
    Emotion findByPostId(int postId);
}
