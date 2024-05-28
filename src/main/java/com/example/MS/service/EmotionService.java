package com.example.MS.service;

import com.example.MS.model.Emotion;
import com.example.MS.repository.EmotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmotionService {

    private final EmotionRepository emotionRepository;

    @Autowired
    public EmotionService(EmotionRepository emotionRepository) {
        this.emotionRepository = emotionRepository;
    }

    public Emotion likePost(int postId) {
        Emotion emotion = emotionRepository.findByPostId(postId);
        if (emotion == null) {
            emotion = new Emotion();
            emotion.setPostId(postId);
        }
        emotion.setLikes(emotion.getLikes() + 1);
        return emotionRepository.save(emotion);
    }

    public Emotion dislikePost(int postId) {
        Emotion emotion = emotionRepository.findByPostId(postId);
        if (emotion == null) {
            emotion = new Emotion();
            emotion.setPostId(postId);
        }
        emotion.setDislikes(emotion.getDislikes() + 1);
        return emotionRepository.save(emotion);
    }
}
