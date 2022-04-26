package com.example.Music.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "track")
public class Music {
        
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="auto_id")
            private Long id;
        
        @Column(name="Name")
        private String Name;
        
        @Column(name="Genre")
        private String Genre;
        
        @Column(name="Artist")
        private String Artist;
        
        @Column(name="Duration_In_Seconds")
        private long DurationInSeconds;

		public Long getId() {
			return id;
		}

		//public void setId(long i) {
			//this.id = i;
		//}

		public String getName() {
			return Name ;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getGenre() {
			return Genre;
		}

		public void setGenre(String genre) {
			Genre = genre;
		}

		public String getArtist() {
			return Artist;
		}

		public void setArtist(String artist) {
			Artist = artist;
		}

		public long getDurationInSeconds() {
			return DurationInSeconds;
		}

		public void setDurationInSeconds(long durationInSeconds) {
			DurationInSeconds = durationInSeconds;
		}

		@Override
		public String toString() {
			return "Music [id=" + id + ", Name=" + Name + ", Genre=" + Genre + ", Artist=" + Artist
					+ ", DurationInSeconds=" + DurationInSeconds + "]";
		}

		public Music(Long id, String name, String genre, String artist, long durationInSeconds) {
			super();
			this.id = id;
			Name = name;
			Genre = genre;
			Artist = artist;
			DurationInSeconds = durationInSeconds;
		}

		public Music() {
			super();
		}

		public void setId(long i) {
		this.id = i;
			// TODO Auto-generated method stub
			
		}
        
        
}
