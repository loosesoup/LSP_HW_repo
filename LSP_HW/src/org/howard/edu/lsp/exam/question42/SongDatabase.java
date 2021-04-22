package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongDatabase {
	
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();
				
	/* Add a song title to a genre */
	public void addSong(String genre, String songTitle) {
		if (map.containsKey(genre))
			map.get(genre).add(songTitle);
		else {
			map.put(genre, new HashSet<String>());
			map.get(genre).add(songTitle);
		}
		
	}
   
    
		/* Return the Set that contains all songs for a genre */
	public Set<String> getSongs(String genre) {
		if (map.containsKey(genre))
			return map.get(genre);
		
			return null;
	}

	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String songTitle) {
			for(Map.Entry<String,Set<String>> key : map.entrySet()) {
				if (map.get(key.getKey()).contains(songTitle))
					return key.getKey();
			}
			return null;
	}

}
