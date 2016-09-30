package fcu.iecs.oop;

public class Hello {

	public static void main(String[] args) {

		String lyrics = "Let it go! Let it go! Cannot hold it back anymore";
		lyrics = lyrics.replaceAll("it","\"her\"");
		lyrics = lyrics.replaceAll("Cannot","Can't");
		System.out.println(lyrics);
	}

}
