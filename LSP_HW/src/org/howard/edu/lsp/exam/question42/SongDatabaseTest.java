package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SongDatabaseTest {

	@Test
	@DisplayName("Test Cases for Remove Zeroes")
	public void testAddSong() {
		SongDatabase db = new SongDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		
		System.out.println(db.toString());

		
	}
	
	@Test
	@DisplayName("Test Cases for Remove Zeroes")
	public void getSongs() {
		SongDatabase db = new SongDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		
	}
	
	@Test
	@DisplayName("Test Cases for Remove Zeroes")
	public void testGetGenreOfSong() {
		
		SongDatabase db = new SongDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Jazz", "Always There");
		
	}
	

}
