package ex3;

public class Song {
	String title;
	String artist;
	int year;
	String contury;
	
	public Song() {
		System.out.println("Song constructor");
	}
	
	public Song(String t, String a, int y, String c) {
		this.title = t;
		this.artist = a;
		this.year = y;
		this.contury = c;
	}
	
	public void show() {
		System.out.println(year + "�� " + contury + "������ " + artist + "�� �θ� " + title);
	}

}
