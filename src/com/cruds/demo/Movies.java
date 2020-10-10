package com.cruds.demo;

public class Movies 
{
int movieid;
String moviename;
String moviehero;
String moviedirector;
int herosal;


public Movies(int movieid, String moviename, String moviehero, String moviedirector, int herosal) {
	super();
	this.movieid = movieid;
	this.moviename = moviename;
	this.moviehero = moviehero;
	this.moviedirector = moviedirector;
	this.herosal = herosal;
}

public int getMovieid() {
	return movieid;
}
public void setMovieid(int movieid) {
	this.movieid = movieid;
}
public String getMovname() {
	return moviename;
}
public void setMovname(String movname) {
	this.moviename = movname;
}
public String getMovhero() {
	return moviehero;
}
public void setMovhero(String movhero) {
	this.moviehero = movhero;
}
public String getMovdirector() {
	return moviedirector;
}
public void setMovdirector(String movdirector) {
	this.moviedirector = movdirector;
}
public int getHerosal() {
	return herosal;
}
public void setHerosal(int herosal) {
	this.herosal = herosal;
}

@Override
public String toString() {
	return "Movies [movieid=" + movieid + ", movname=" + moviename + ", movhero=" + moviehero + ", movdirector="
			+ moviedirector + ", herosal=" + herosal + "]";
}
}
