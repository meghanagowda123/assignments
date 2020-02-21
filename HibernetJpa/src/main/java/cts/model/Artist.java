package cts.model;

import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="Artists")
public class Artist implements Comparable<Artist> {
	
	@Id
	private int aid;
	private String eName;
	
	@ManyToMany(cascade= { CascadeType.ALL})
	@JoinTable(name = "MovieArtists",
	joinColumns = { @JoinColumn(name= "aid")},
	inverseJoinColumns = { @JoinColumn(name = "mid")})
	private Set<Movie> movies;

	public Artist() {
		super();
	}

	public Artist(int aid, String eName, Set<Movie> movies) {
		super();
		this.aid = aid;
		this.eName = eName;
		this.movies = movies;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

	public int compareTo(Artist a) {
		return(this.aid<a.aid?-1:(this.aid>a.aid?1:0));
	}	
	

}
