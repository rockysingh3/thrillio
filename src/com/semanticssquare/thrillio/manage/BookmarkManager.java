package com.semanticssquare.thrillio.manage;

import com.semanticssquare.thrillio.entites.Book;
import com.semanticssquare.thrillio.entites.Movie;
import com.semanticssquare.thrillio.entites.WebLink;

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
	
	public WebLink createWebLink(long id, String title, String url, String host) {
		WebLink weblink = new WebLink();
		weblink.setId(id);
		weblink.setTitle(title);
		weblink.setHost(host);
		weblink.setUrl(url);
		
		return weblink;
	}
	
	public Book createBook(long id, String title, int publicationYear, String publisher, double amazonRating, String[] authors, String genre) {
		Book book = new Book();
		book.setId(id);
		book.setPublicationYear(publicationYear);
		book.setTitle(title);
		book.setPublisher(publisher);
		book.setAmazonRating(amazonRating);
		book.setAuthors(authors);
		book.setGenre(genre);
	
		return book;
	}

}
