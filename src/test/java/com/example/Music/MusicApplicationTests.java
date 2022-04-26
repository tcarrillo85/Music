package com.example.Music;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Music.model.Music;
import com.example.Music.repository.MusicRepository;



@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MusicApplicationTests {

	@Autowired
	MusicRepository mRepo;
	
	@Test
	@Order(1)
	public void testOne () {
		Music m = new Music();
		m.setId(2L);
		m.setName("Back in Black");
		m.setArtist("AC/DC");
		m.setGenre("Rock");
		m.setDurationInSeconds(250);
		mRepo.save(m);
		assertNotNull(mRepo.findById(2L));
	}
		
		@Test
		@Order(2)
		public void testReadAll() {
			List<Music>list=mRepo.findAll();
			assertTrue(list.size()>0);
		}
		@Test
		@Order(3)
		public void testSingleMusicTracks() {
			Music music= mRepo.findById(2L).get();
			assertEquals("Rock",music.getGenre());
			}
		@Test
		@Order(4)
		public void testUpdate() {
			Music music = mRepo.findById(2L).get();
			music.setDurationInSeconds(250);
			mRepo.save(music);
			assertNotEquals(190, mRepo.findById(2L).get().getDurationInSeconds());
			}
		
		@Test
		@Order(5)
		public void testDelete( ) {
			mRepo.deleteById(2L);
	        assertFalse(mRepo.existsById(2L));
			
		}
	}


