package com.example.Music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Music.model.Music;
import com.example.Music.service.MusicService;

@RestController
@RequestMapping("/music")
public class MusicController {
        @Autowired
        MusicService MusicService;
        

                 @PostMapping("/track")
                public Music createMusic(@RequestBody Music track) {
                    return MusicService.createMusic(track);
                }
                
                @GetMapping("/track")
                public List<Music> readMusic() {
                    return MusicService.getMusic();
                }

                @PutMapping("/track/{track_id}")
                public Music readEmployees(@PathVariable(value = "track_id") Long id, @RequestBody Music trackDetails) {
                    return MusicService.updateMusic(id, trackDetails);
                }

                @DeleteMapping("/track/{track_id}")
                public void deleteMusic(@PathVariable(value = "track_id") Long id) {
                    MusicService.deleteMusic(id);
                }



        }



