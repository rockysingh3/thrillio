package com.semanticssquare.thrillio.manage;

import com.semanticssquare.thrillio.entites.Movie;

public class BookmarkManager {
	private static BookmarkManager instance = new BookmarkManager();
	
	private BookmarkManager() {}
	
	public static BookmarkManager getInstance() {
		return instance;
	}
	
	public Movie createMovie(long id, String title, String profileURL, int releaseYear, String[] cast, String[] directors, String genre, double imdbRating) {
		Movie movie = new Movie();
		movie.setId(id);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);
		movie.setProfileURL(profileURL);
		movie.setReleaseYear(releaseYear);
		movie.setTitle(title);
		
		return movie;
		
	}

}
