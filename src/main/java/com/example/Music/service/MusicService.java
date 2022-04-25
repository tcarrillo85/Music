package com.example.Music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Music.model.Music;
import com.example.Music.repository.MusicRepository;
import java.util.List;

@Service
public class MusicService {

        @Autowired
            MusicRepository musicRepository;        

//CREATE 
public Music createMusic(Music music) {
 return musicRepository.save(music);
}

//READ
public List<Music> getMusic() {
 return musicRepository.findAll();
}

//DELETE
public void deleteMusic(Long track_Id) {
 musicRepository.deleteById(track_Id);
}
//UPDATE
public Music updateMusic(Long track_id, Music musicDetails) {
      Music update = musicRepository.findById(track_id).get();
      update.setName(musicDetails.getName());
      update.setGenre(musicDetails.getGenre());
      update.setArtist(musicDetails.getArtist());
      update.setDurationInSeconds(musicDetails.getDurationInSeconds());
      
      return musicRepository.save(update);                              

}
}
