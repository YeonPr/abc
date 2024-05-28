package com.example.MS.controller;

import com.example.MS.model.Emotion;
import com.example.MS.service.EmotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board/posts/{postid}/")
public class EmotionController {

    private final EmotionService emotionService;

    @Autowired
    public EmotionController(EmotionService emotionService) {
        this.emotionService = emotionService;
    }

    @PutMapping("/like/{postId}")
    public Emotion likePost(@PathVariable int postId) {
        return emotionService.likePost(postId);
    }

    @PutMapping("/dislike/{postId}")
    public Emotion dislikePost(@PathVariable int postId) {
        return emotionService.dislikePost(postId);
    }
}
